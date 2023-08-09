package com.ufg.ufgimpacto.domain.services;

import com.ufg.ufgimpacto.domain.Student;
import com.ufg.ufgimpacto.domain.dto.input.CourseInput;
import com.ufg.ufgimpacto.domain.dto.input.ProjectInput;
import com.ufg.ufgimpacto.domain.dto.output.CourseOutput;
import com.ufg.ufgimpacto.domain.dto.output.ProjectOutput;
import com.ufg.ufgimpacto.domain.dto.output.StudentOutput;
import com.ufg.ufgimpacto.domain.ports.api.ApiPort;
import com.ufg.ufgimpacto.domain.ports.service.UseCasePort;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class IndicatorUseCaseImpl implements UseCasePort {

  private ApiPort apiPort;

  public IndicatorUseCaseImpl(ApiPort apiPort) {
    this.apiPort = apiPort;
  }

  @Override
  public Map<Integer, List<ProjectOutput>> project() {
   List<ProjectInput> projectInputList = apiPort.project();
   List<ProjectOutput> projectOutputList =  projectInputList.stream()
       .map(projectInput -> new ProjectOutput(projectInput.getIdProjeto(), projectInput.getTipo_projeto(),
                                              projectInput.getTitulo_projeto(),
                                              projectInput.getResumo_projeto(),
                                              projectInput.getSigla_unidade_projeto(),
                                              projectInput.getNome_unidade_projeto(),
                                              projectInput.getId_unidade_projeto()))
                                              .collect(Collectors.toList());

    Map<Integer, List<ProjectOutput>> groupByTypeMap = projectOutputList.stream()
        .collect(Collectors.groupingBy(ProjectOutput::getAcademicUnitId));
    return groupByTypeMap;
  }

  @Override
  public Map<String, List<ProjectOutput>> projectByTypeProject() {
    List<ProjectInput> projectInputList = apiPort.project();
    List<ProjectOutput> projectOutputList =  projectInputList.stream()
        .map(projectInput -> new ProjectOutput(projectInput.getIdProjeto(), projectInput.getTipo_projeto(),
            projectInput.getTitulo_projeto(),
            projectInput.getResumo_projeto(),
            projectInput.getSigla_unidade_projeto(),
            projectInput.getNome_unidade_projeto(),
            projectInput.getId_unidade_projeto()))
        .collect(Collectors.toList());

    Map<String, List<ProjectOutput>> groupByTypeMap = projectOutputList.stream()
        .collect(Collectors.groupingBy(ProjectOutput::getType));
    return groupByTypeMap;
  }

  @Override
  public Map course() {
    List<CourseInput> courseInputList = apiPort.course();
    List<CourseOutput>  courseOutputList = courseInputList.stream()
        .map(courseInput -> new CourseOutput(courseInput.getId_curso(),
            courseInput.getNome(), courseInput.getModalidade(), courseInput.getId_unidade(),
            courseInput.getUnidade(), courseInput.getSigla_unidade(),
            courseInput.getMunicipio(), courseInput.getId_campus(), courseInput.getCampus())).collect(Collectors.toList());
    Map<Long, List<CourseOutput>> groupByTypeMap = courseOutputList.stream()
        .collect(Collectors.groupingBy(CourseOutput::getIdCampus));
    return groupByTypeMap;
  }

  @Override
  public Map courseByAcademicUnit() {
    List<CourseInput> courseInputList = apiPort.course();
    List<CourseOutput>  courseOutputList = courseInputList.stream()
        .map(courseInput -> new CourseOutput(courseInput.getId_curso(),
            courseInput.getNome(), courseInput.getModalidade(), courseInput.getId_unidade(),
            courseInput.getUnidade(), courseInput.getSigla_unidade(),
            courseInput.getMunicipio(), courseInput.getId_campus(), courseInput.getCampus())).collect(Collectors.toList());
    Map<Long, List<CourseOutput>> groupByTypeMap = courseOutputList.stream()
        .collect(Collectors.groupingBy(CourseOutput::getIdAcademicUnit));
    return groupByTypeMap;
  }

  public StudentOutput student() {

    List<Student> students = studentDataSpreadsheet();
    Long total = students.stream().collect(Collectors.counting());

    Map<String, List<Student>> mapListGraduate = students.stream().collect(Collectors.groupingBy(Student::getStatus));

    Long totalGraduateStudents = mapListGraduate.get("Graduado").stream().count();
    List<Student> graduateStudents = mapListGraduate.get("Graduado");

    Map<Integer, List<Student>> mapGraduateStudentsByYear = graduateStudents.stream()
        .collect(Collectors.groupingBy(Student::getYearDetachment));

    Map<Integer, Long> mapGraduateStudentsYear = new TreeMap<>();

    var set = mapGraduateStudentsByYear.keySet();

    for (Integer year: set) {
      mapGraduateStudentsYear.put(year, mapGraduateStudentsByYear.get(year).stream().count());
    }

    Map <String, List<Student>> mapList = graduateStudents.stream().collect(Collectors.groupingBy(Student::getSex));
    Long totalMale = mapList.get("Masculino").stream().count();
    Long totalFemale = mapList.get("Feminino").stream().count();
    Map <String, List<Student>> graduateStudentsMap = students.stream().collect(Collectors.groupingBy(Student::getRace));
    Long totalRaceBlack = graduateStudentsMap.get("Preto").stream().count();
    Long totalRaceBrown = graduateStudentsMap.get("Pardo").stream().count();
    Long totalNotDeclare = graduateStudentsMap.get("Não quis declarar").stream().count();
    Long totalNotInformaded = graduateStudentsMap.get("Não Informado").stream().count();
    Long totalWhite = graduateStudentsMap.get("Branco").stream().count();
    Map<String, List<Student>>  totalAffirmativeActionMap = graduateStudents.stream()
        .collect(Collectors.groupingBy(student -> student.getAffirmativeAction() == null ? "false" : student.getAffirmativeAction()));
    Long totalAffirmativeAction = totalAffirmativeActionMap.get("true").stream().count();

    StudentOutput studentOutput = new StudentOutput(total, totalGraduateStudents, totalMale,
        totalFemale, (totalRaceBlack + totalRaceBrown), totalWhite,
        (totalNotDeclare + totalNotInformaded), totalAffirmativeAction, mapGraduateStudentsYear);

    return studentOutput;
  }

  public List<Student> studentDataSpreadsheet() {

    final String fileName = "src/main/spreadsheet/relacao_aluno.xlsx";
    List<Student> students = new ArrayList<>();

    try {
      FileInputStream fileInputStream = new FileInputStream(fileName);
      XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
//      HSSFWorkbook workbook = new HSSFWorkbook(new POIFSFileSystem(fileInputStream));
      XSSFSheet xssfSheet = workbook.getSheetAt(0);
//      HSSFSheet sheetStudents = workbook.getSheetAt(0);
      Iterator<Row> rowIterator = xssfSheet.iterator();
      rowIterator.next();

      while(rowIterator.hasNext()) {
        Row row = rowIterator.next();
        Iterator<Cell> cellIterator = row.cellIterator();

        Student student = new Student();
        students.add(student);
        while(cellIterator.hasNext()) {
          Cell cell = cellIterator.next();
          switch (cell.getColumnIndex()) {
            case 0:
              student.setCityName(cell.getStringCellValue());
              break;
            case 1:
              student.setCourse(cell.getStringCellValue());
              break;
            case 8:
              student.setYearOfEntry((int) cell.getNumericCellValue());
              break;
            case 13:
              String affirmativeAction = cell.getStringCellValue().equalsIgnoreCase("Ac") ? "true": "false";
              student.setAffirmativeAction(affirmativeAction);
              break;
            case 15:
              student.setGlobalAverage((float) cell.getNumericCellValue());
              break;
            case 17:
              student.setCourseGlobalAverage((float) cell.getNumericCellValue());
              break;
            case 19:
              student.setMaximumDeadlineCompletionCourse(Integer.valueOf(cell.getStringCellValue().split("/")[0]));
              break;
            case 20:
              student.setStatus(cell.getStringCellValue());
              break;
            case 22:
              var year = (int) cell.getNumericCellValue();
              student.setYearDetachment(year);
              break;
            case 24:
              student.setSex(cell.getStringCellValue());
              break;
            case 25:
              student.setRace(cell.getStringCellValue());
              break;
          }
        }
      }
      return students;
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    }
  }
}
