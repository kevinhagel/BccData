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

/**
 * School is an optional association for {@link Student}.  Adult students for example don't attend a school. A school
 * name includes the term, as in "German High School 2021-2022" ... of course the user of the database will be told this
 * fact, they can name the school anyway they want.  This is a nosql database. having an external "Term" table is not
 * useful.
 *
 * @author Kevin Hagel
 @Data
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class School {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id = -1l;

  private String name;
  private String contactName;
  private String contactPhone;
  private String addressStreet;
  private String addressCity;
  private String notes;
}
