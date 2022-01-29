package com.bcc.data.repo;

import com.bcc.data.entity.Instructor;
import org.springframework.data.repository.CrudRepository;

/**
 * InstructorRepository
 *
 * @author Kevin Hagel
 * @since 30.01.22
 */
public interface InstructorRepository extends CrudRepository<Instructor, Long> {

}
