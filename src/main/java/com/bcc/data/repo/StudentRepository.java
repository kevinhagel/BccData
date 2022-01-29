package com.bcc.data.repo;

import com.bcc.data.entity.Student;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Student crud repository
 */
public interface StudentRepository extends CrudRepository<Student, Long> {


  /**
   * find students by matching family name
   * @param familyName
   * @return
   */
  List<Student> findAllByFamilyName(@Param("familyName") String familyName);

}