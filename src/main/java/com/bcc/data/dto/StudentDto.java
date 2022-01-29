package com.bcc.data.dto;

import com.bcc.data.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * StudentDto is a dto transferring {@link Student} information to the rest client.
 *
 * @author Kevin Hagel
 * @version 2022-01-29
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
  private Long id;
  private String firstName;
  private String familyName;
  private String homePhoneNumber;
  private String cellPhoneNumber;
  private String dateOfBirth;
  private String email;
  private String notes;
  private boolean active;

}
