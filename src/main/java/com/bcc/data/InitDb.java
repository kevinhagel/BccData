package com.bcc.data;

import com.bcc.data.entity.Contact;
import com.bcc.data.entity.School;
import com.bcc.data.entity.Student;
import com.bcc.data.repo.ContactRepository;
import com.bcc.data.repo.CourseRepository;
import com.bcc.data.repo.InstructorRepository;
import com.bcc.data.repo.SchoolRepository;
import com.bcc.data.repo.StudentRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

/**
 * InitDb
 *
 * @author Kevin Hagel
 * @since 6.02.22
 */
@Configuration
public class InitDb {

  @Autowired ObjectMapper mapper;
  @Autowired private StudentRepository studentRepository;
  @Autowired private SchoolRepository schoolRepository;
  @Autowired private ContactRepository contactRepository;
  @Autowired private CourseRepository courseRepository;
  @Autowired private InstructorRepository instructorRepository;


  @Value("classpath:/students.json")
  private Resource studentsJson;

  @Value("classpath:/contacts.json")
  private Resource contactsJson;


  @Value("classpath:/schools.json")
  private Resource schoolsJson;

  @Bean
  CommandLineRunner runner() {
    return args -> {
//      System.out.println(studentsJson.exists());
//      Student[] foo = mapper.readValue(studentsJson.getFile(), Student[].class);
//      Arrays.stream(foo).forEach(studentRepository::save);
//      Contact[] contacts = mapper.readValue(contactsJson.getFile(), Contact[].class);
//      Arrays.stream(contacts).forEach(contactRepository::save);
//      School[] schools = mapper.readValue(schoolsJson.getFile(), School[].class);
//      Arrays.stream(schools).forEach(schoolRepository::save);
    };
  }

}
