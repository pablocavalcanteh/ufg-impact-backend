package com.ufg.ufgimpacto.adapters.providers.in.apiufg;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ufg.ufgimpacto.domain.dto.input.CourseInput;
import com.ufg.ufgimpacto.domain.dto.input.ProjectInput;
import com.ufg.ufgimpacto.domain.dto.input.ScheduleInput;
import com.ufg.ufgimpacto.domain.dto.input.TeamInput;
import com.ufg.ufgimpacto.domain.ports.api.ApiPort;
import com.ufg.ufgimpacto.domain.token.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApiUfgImpl implements ApiPort {

  @Autowired
  private RestTemplate restTemplate;
  @Autowired
  private ObjectMapper mapper;

  @Override
  public List<ProjectInput> project() {
    Token token = token();
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.set("Authorization", "Bearer " + token.getAccess_token());
      HttpEntity<String> entity = new HttpEntity<>(headers);
      ResponseEntity<Object> responseEntity = restTemplate
          .exchange("https://data.api.ufg.br/ensino/projetos/1.0.0/projetos_em_andamento",
          HttpMethod.GET, entity, Object.class);

      LinkedHashMap linkedHashMapBody = (LinkedHashMap) responseEntity.getBody();
      ArrayList<LinkedHashMap> linkedHashMapArrayList = (ArrayList) linkedHashMapBody.get("content");
      return linkedHashMapArrayList.stream().map(linkedHashMap -> mapper.convertValue(linkedHashMap, new TypeReference<ProjectInput>() {})).collect(Collectors.toList());
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override
  public List<CourseInput> course() {
    Token token = token();
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.set("Authorization", "Bearer " + token.getAccess_token());
      HttpEntity<String> entity = new HttpEntity<>(headers);
      ResponseEntity<Object> responseEntity = restTemplate.exchange("https://data.api.ufg.br/ensino/cursos/1.0.0/curso_graduacao",
          HttpMethod.GET, entity, Object.class);

      LinkedHashMap linkedHashMapBody = (LinkedHashMap) responseEntity.getBody();
      ArrayList<LinkedHashMap> linkedHashMapArrayList = (ArrayList) linkedHashMapBody.get("rows");
      return linkedHashMapArrayList.stream().map(linkedHashMap -> mapper.convertValue(linkedHashMap, new TypeReference<CourseInput>() {})).collect(Collectors.toList());
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override
  public List<TeamInput> team() {
    Token token = token();
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.set("Authorization", "Bearer " + token.getAccess_token());
      HttpEntity<String> entity = new HttpEntity<>(headers);
      ResponseEntity<Object> responseEntity = restTemplate.exchange("https://data.api.ufg.br/ensino/turmas/1.0.0/turmas",
          HttpMethod.GET, entity, Object.class);

      LinkedHashMap linkedHashMapBody = (LinkedHashMap) responseEntity.getBody();
      ArrayList<LinkedHashMap> linkedHashMapArrayList = (ArrayList) linkedHashMapBody.get("content");
      return linkedHashMapArrayList.stream().map(linkedHashMap -> mapper.convertValue(linkedHashMap, new TypeReference<TeamInput>() {})).collect(Collectors.toList());
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override
  public List<ScheduleInput> schedule() {
    Token token = token();
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.set("Authorization", "Bearer " + token.getAccess_token());
      HttpEntity<String> entity = new HttpEntity<>(headers);
      ResponseEntity<Object> responseEntity = restTemplate.exchange("https://data.api.ufg.br/ensino/horarios/1.0.0/horarios",
          HttpMethod.GET, entity, Object.class);

      LinkedHashMap linkedHashMapBody = (LinkedHashMap) responseEntity.getBody();
      ArrayList<LinkedHashMap> linkedHashMapArrayList = (ArrayList) linkedHashMapBody.get("content");
      return linkedHashMapArrayList.stream().map(linkedHashMap -> mapper.convertValue(linkedHashMap, new TypeReference<ScheduleInput>() {})).collect(Collectors.toList());

    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    }
  }

  private Token token() {

    try {
      HttpHeaders headers = new HttpHeaders();
      headers.set("Authorization", "Basic " + "NThiN0ZyZElQRnYxYWZVTjNpbGw2YmZkTnlJYTpmcGxsMFU1dnFBVlB3OHAybVJKNnhlcHViSUFh");
      headers.set("Content-Type", "application/x-www-form-urlencoded");
      MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
      map.add("grant_type", "client_credentials");
      HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(map, headers);
      ResponseEntity<Token> responseEntity = restTemplate.postForEntity("https://data.api.ufg.br/token", entity, Token.class);
      return responseEntity.getBody();
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    }
  }
}
