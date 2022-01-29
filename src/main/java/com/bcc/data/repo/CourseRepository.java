package com.bcc.data.repo;

import com.bcc.data.entity.Course;
import org.springframework.data.repository.CrudRepository;

/**
 * CourseRepository
 *
 * @author Kevin Hagel
 * @since 30.01.22
 */
public interface CourseRepository extends CrudRepository<Course, Long> {

}
