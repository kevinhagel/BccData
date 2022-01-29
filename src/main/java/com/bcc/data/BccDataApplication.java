package com.bcc.data;

import com.bcc.data.service.StudentService;
import javax.persistence.criteria.CriteriaBuilder.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BccDataApplication {

  @Autowired
  private InitDb initDb;

  public static void main(String[] args) {
    SpringApplication.run(BccDataApplication.class, args);
  }



}
