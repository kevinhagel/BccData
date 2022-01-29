package com.bcc.data.service;

import com.bcc.data.repo.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * InstructorService
 *
 * @author Kevin Hagel
 * @since 30.01.22
 */
@Service
public class InstructorService {

  private final InstructorRepository instructorRepository;

  @Autowired
  public InstructorService(InstructorRepository instructorRepository) {
    this.instructorRepository = instructorRepository;
  }
}
