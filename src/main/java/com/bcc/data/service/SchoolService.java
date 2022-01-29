package com.bcc.data.service;
import com.bcc.data.repo.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SchoolService
 *
 * @author Kevin Hagel
 * @since 30.01.22
 */
@Service
public class SchoolService {

  private final SchoolRepository schoolRepository;

  @Autowired
  public SchoolService(SchoolRepository schoolRepository) {
    this.schoolRepository = schoolRepository;
  }
}
