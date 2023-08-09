package com.ufg.ufgimpacto.adapters.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ufg.ufgimpacto.domain.ports.api.ApiPort;
import com.ufg.ufgimpacto.domain.services.IndicatorUseCaseImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfiguration {

  @Bean
  IndicatorUseCaseImpl instanceUseCaseIndicator(ApiPort apiPort) {
    return new IndicatorUseCaseImpl(apiPort);
  }

  @Bean
  ModelMapper modelMapper() {
    return new ModelMapper();
  }

  @Bean
  ObjectMapper objectMapper() {
    return new ObjectMapper();
  }

  @Bean
  RestTemplate restTemplate() {
    return new RestTemplate();
  }

}
