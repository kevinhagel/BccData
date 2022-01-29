package com.bcc.data.dto;

import com.bcc.data.entity.Contact;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


/**
 * ParentDto is a dto transferring {@link Contact} information to the rest client.
 *
 * @author Kevin Hagel
 * @version 2022-01-29
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class ContactDto {

  private Long id;
  private String cellPhoneNumber;
  private String email;
  private String familyName;
  private String firstName;
  private String homePhoneNumber;
  private String notes;
  private String officePhoneNumber;
  private String workPhoneNumber;
}
