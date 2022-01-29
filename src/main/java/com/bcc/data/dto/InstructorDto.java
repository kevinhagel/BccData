package com.bcc.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


/**
 * InstructorDto is a dto transferring Instructor information to the rest client.
 *
 * @author Kevin Hagel
 * @version 2022-01-29
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class InstructorDto {

  private Long id;
  private String phoneNumber;
  private String fullName;
  private String address;


}
