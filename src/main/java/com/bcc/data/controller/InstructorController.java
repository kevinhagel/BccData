package com.bcc.data.controller;

import com.bcc.data.repo.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * InstructorController
 *
 * @author Kevin Hagel
 * @since 6.02.22
 */
@RestController
public class InstructorController {

  private final InstructorRepository instructorRepository;

  @Autowired
  public InstructorController(InstructorRepository instructorRepository) {
    this.instructorRepository = instructorRepository;
  }
}
