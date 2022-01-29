package com.bcc.data.repo;

import com.bcc.data.entity.Contact;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * ContactRepository
 *
 * @author Kevin Hagel
 * @since 30.01.22
 */
public interface ContactRepository extends CrudRepository<Contact, Long> {


   /**
    * find contacts by matching family name
    * @param familyName
    * @return
    */
   List<Contact> findAllByFamilyName(@Param("familyName") String familyName);

}
