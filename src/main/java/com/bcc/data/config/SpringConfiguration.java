package com.bcc.data.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * SpringConfiguration
 *
 * @author Kevin Hagel
 * @since 19.02.22
 */
@Configuration
public class SpringConfiguration {

  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }

}
