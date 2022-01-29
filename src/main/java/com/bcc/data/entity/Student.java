package com.bcc.data.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Student
 *
 * @author Kevin Hagel
 * @since 2022-01-29
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id = -1l;

  private String firstName;
  private String familyName;
  private String homePhoneNumber;
  private String cellPhoneNumber;
  private String dateOfBirth;
  private String email;
  private String notes;
  private boolean active;

}
