package com.bcc.data.controller;

import com.bcc.data.dto.StudentDto;
import com.bcc.data.entity.Course;
import com.bcc.data.entity.Student;
import com.bcc.data.repo.StudentRepository;
import com.bcc.data.service.StudentService;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * StudentController
 *
 * @author Kevin Hagel
 * @since 6.02.22
 */
@RestController
@RequestMapping("/students")
public class StudentController {

  public final StudentRepository studentRepository;

  @Autowired
  private ModelMapper modelMapper;

  @Autowired
  public StudentController(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  @GetMapping("")
  public List<StudentDto> getStudents() {
    return StreamSupport.stream(studentRepository.findAll().spliterator(), false)
      .map(this::convertToDto)
      .collect(Collectors.toList());
  }

  @PostMapping("")
  public Optional<StudentDto> save(@RequestBody Student student) {
    return Optional.ofNullable(studentRepository.save(student)).map(this::convertToDto);
  }

  @GetMapping("/{id}")
  public Optional<StudentDto> getStudent(@PathVariable("id") Long id) {
    Optional<StudentDto> dto = studentRepository
      .findById(id).map(student -> this.convertToDto(student));
    return dto;
  }

  private StudentDto convertToDto(Student student) {
    StudentDto studentDto = modelMapper.map(student, StudentDto.class);
    return studentDto;
  }

}
