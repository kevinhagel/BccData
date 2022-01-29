package com.bcc.data.repo;

import com.bcc.data.entity.Student;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

  @Override
  Optional<Student> findById(Long aLong);
}