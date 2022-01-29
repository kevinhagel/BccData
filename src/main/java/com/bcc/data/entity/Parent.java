package com.bcc.data.entity;

import java.io.Serializable;
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
 * Parent is responsible for 0, 1, or many students.  A parent with 0 students is probably an archived parent.  Parents
 * are never deleted.  Not all people who pay for a student are "parents" ... maybe I should call this "contact"
 *
 * @author Kevin Hagel
 * @version 2022-01-29
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Parent {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id = -1l;

  private String cellPhoneNumber;
  private String email;
  private String familyName;
  private String firstName;
  private String homePhoneNumber;
  private String notes;
  private String officePhoneNumber;
  private String workPhoneNumber;
}
