package com.bcc.data.entity;

import static javax.persistence.CascadeType.ALL;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * School is an optional association for {@link Student}.  Adult students for example don't attend a school. A school
 * name includes the term, as in "German High School 2021-2022" ... of course the user of the database will be told this
 * fact, they can name the school anyway they want.  This is a nosql database. having an external "Term" table is not
 * useful.
 *
 * @author Kevin Hagel
 * @Data
 */
@Data
@EqualsAndHashCode(exclude = {"id"})
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class School implements Serializable {

  private static final long serialVersionUID = 495716772949477661L;


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id = -1l;

  private String name;
  private String contactName;
  private String contactPhone;
  private String addressStreet;
  private String addressCity;
  private String notes;
  private String website;


  @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
  private Set<SchoolTerm> schoolTerms = new HashSet<>(0);
}
