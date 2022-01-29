package com.bcc.data.entity;

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
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


/**
 * Parent is responsible for 0, 1, or many students.  A parent with 0 students is probably an archived parent.  Parents
 * are never deleted.  Not all people who pay for a student are "parents" ... maybe I should call this "contact"
 *
 * @author Kevin Hagel
 * @version 2022-01-29
 */
@Data
@EqualsAndHashCode(exclude = {"id"})
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "contact")
public class Contact implements Serializable {

  private static final long serialVersionUID = 7337692566717224897L;


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
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
  private String extraShit;


  @ManyToMany(targetEntity = Student.class, mappedBy = "contacts", fetch = FetchType.LAZY, cascade = {
    CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
  private Set<Student> students = new HashSet<>(0);
}
