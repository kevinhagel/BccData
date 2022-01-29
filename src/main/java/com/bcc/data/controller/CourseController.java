package com.bcc.data.controller;

import com.bcc.data.entity.Course;
import com.bcc.data.repo.CourseRepository;
import java.util.Optional;
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
 * CourseController
 *
 * @author Kevin Hagel
 * @since 6.02.22
 */
@RestController
public class CourseController {

  private final CourseRepository courseRepository;

  @Autowired
  public CourseController(CourseRepository courseRepository) {
    this.courseRepository = courseRepository;
  }

  @GetMapping("/courses")
  public Iterable<Course> getCourses() {
    return courseRepository.findAll();
  }

  @GetMapping("/courses/{id}")
  public Optional<Course> getCourse(@PathVariable("id") Long id) {
    return courseRepository.findById(id);
  }

  @PostMapping("/courses")
  public Course saveCourse(@RequestBody Course course) {
    return courseRepository.save(course);
  }

}
