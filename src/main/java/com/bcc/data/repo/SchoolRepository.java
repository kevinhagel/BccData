package com.bcc.data.repo;

import com.bcc.data.entity.School;
import org.springframework.data.repository.CrudRepository;

/**
 * SchoolRepository
 *
 * @author Kevin Hagel
 * @since 30.01.22
 */
public interface SchoolRepository extends CrudRepository<School, Long> {

}
