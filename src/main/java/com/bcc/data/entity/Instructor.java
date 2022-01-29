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
 * Instructor teaches a course.
 *
 * @author Kevin Hagel
 * @since 2022-01-29
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Instructor  {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id = -1l;

  private String phoneNumber;
  private String fullName;
  private String address;


}
