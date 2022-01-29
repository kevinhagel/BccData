package com.bcc.data.controller;

import com.bcc.data.entity.School;
import com.bcc.data.repo.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SchoolController
 *
 * @author Kevin Hagel
 * @since 6.02.22
 */
@RestController
public class SchoolController {

  private final SchoolRepository schoolRepository;

  @Autowired
  public SchoolController(SchoolRepository schoolRepository) {
    this.schoolRepository = schoolRepository;
  }

  @GetMapping("/schools")
  public Iterable<School> getSchools() {
    return schoolRepository.findAll();
  }
}
