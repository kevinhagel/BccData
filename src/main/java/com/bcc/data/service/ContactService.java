package com.bcc.data.service;

import com.bcc.data.repo.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ContactService
 *
 * @author Kevin Hagel
 * @since 30.01.22
 */
@Service
public class ContactService {

  private final ContactRepository contactRepository;

  @Autowired
  public ContactService(ContactRepository contactRepository) {
    this.contactRepository = contactRepository;
  }

}
