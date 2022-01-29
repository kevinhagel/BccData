package com.bcc.data.utils;

import com.bcc.data.dto.*;
import com.bcc.data.entity.Course;
import com.bcc.data.entity.Instructor;
import com.bcc.data.entity.Contact;
import com.bcc.data.entity.School;
import com.bcc.data.entity.Student;
import org.hibernate.annotations.Parent;
import org.springframework.beans.BeanUtils;

/**
 * MapperUtils contains static mappers to create Dtos from Entities, and Entities from Dtos.
 *
 * @author Kevin Hagel
 * @since 2021-07-25
 */
public class MapperUtils {

  /**
   * Maps a {@link Student} to a {@link StudentDto}
   *
   * @param student the source student.
   * @return the destination student dto.
   */
  public static StudentDto contactEntityToDto(Student student) {
    StudentDto studentDto = new StudentDto();
    BeanUtils.copyProperties(student, studentDto);
    return studentDto;
  }

  /**
   * Maps a {@link StudentDto} to a {@link Student}
   *
   * @param studentDto the source student dto.
   * @return the destination student.
   */
  public static Student dtoToEntity(StudentDto studentDto) {
    Student student = new Student();
    BeanUtils.copyProperties(studentDto, student);
    return student;
  }

  /**
   * Maps a {@link Course} to a {@link CourseDto}
   *
   * @param course the source course.
   * @return the destination course dto.
   */
  public static CourseDto contactEntityToDto(Course course) {
    CourseDto courseDto = new CourseDto();
    BeanUtils.copyProperties(course, courseDto);
    return courseDto;
  }

  /**
   * Maps a {@link CourseDto} to a {@link Course}
   *
   * @param courseDto the source course dto.
   * @return the destination course.
   */
  public static Course dtoToEntity(CourseDto courseDto) {
    Course course = new Course();
    BeanUtils.copyProperties(courseDto, course);
    return course;
  }


  /**
   * Maps a {@link Parent} to a {@link ContactDto}
   *
   * @param contact the source course.
   * @return the destination course dto.
   */
  public static ContactDto entityToDto(Contact contact) {
    ContactDto contactDto = new ContactDto();
    BeanUtils.copyProperties(contact, contactDto);
    return contactDto;
  }

  /**
   * Maps a {@link CourseDto} to a {@link Course}
   *
   * @param parentDto the source course dto.
   * @return the destination course.
   */
  public static Contact dtoToEntity(ContactDto contactDto) {
    Contact contact = new Contact();
    BeanUtils.copyProperties(contactDto, contact);
    return contact;
  }

  /**
   * Maps a {@link School} to a {@link SchoolDto}
   *
   * @param school the source school.
   * @return the destination school dto.
   */
  public static SchoolDto contactEntityToDto(School school) {
    SchoolDto schoolDto = new SchoolDto();
    BeanUtils.copyProperties(school, schoolDto);
    return schoolDto;
  }

  /**
   * Maps a {@link SchoolDto} to a {@link School}
   *
   * @param schoolDto the source school dto.
   * @return the destination school.
   */
  public static School dtoToEntity(SchoolDto schoolDto) {
    School parent = new School();
    BeanUtils.copyProperties(schoolDto, parent);
    return parent;
  }


  /**
   * Maps a {@link Instructor} to a {@link InstructorDto}
   *
   * @param instructor the source instructor.
   * @return the destination instructor dto.
   */
  public static InstructorDto contactEntityToDto(Instructor instructor) {
    InstructorDto instructorDto = new InstructorDto();
    BeanUtils.copyProperties(instructor, instructorDto);
    return instructorDto;
  }

  /**
   * Maps a {@link InstructorDto} to a {@link Instructor}
   *
   * @param instructorDto the source school dto.
   * @return the destination school.
   */
  public static Instructor dtoToEntity(InstructorDto instructorDto) {
    Instructor instructor = new Instructor();
    BeanUtils.copyProperties(instructorDto, instructor);
    return instructor;
  }


}
