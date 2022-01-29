package com.bcc.data.controller;

import com.bcc.data.dto.ContactDto;
import com.bcc.data.entity.Contact;
import com.bcc.data.repo.ContactRepository;
import com.bcc.data.utils.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * ContactController
 *
 * @author Kevin Hagel
 * @since 6.02.22
 */
@RestController
public class ContactController {

  private final ContactRepository contactRepository;


  @Autowired
  public ContactController(ContactRepository contactRepository) {
    this.contactRepository = contactRepository;
  }

  @RequestMapping("/contacts")
  public Flux<ContactDto> getContacts() {
    return Flux.fromIterable(contactRepository.findAll()).map(contact -> MapperUtils.entityToDto(contact));
  }
}
