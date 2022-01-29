package com.bcc.data.service;

import com.bcc.data.entity.Student;
import com.bcc.data.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * StudentService
 *
 * @author Kevin Hagel
 * @since 30.01.22
 */
@Service
public class StudentService {

  private final StudentRepository studentRepository;


  @Autowired
  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public Iterable<Student> getStudents() {
    return studentRepository.findAll();
  }

}
