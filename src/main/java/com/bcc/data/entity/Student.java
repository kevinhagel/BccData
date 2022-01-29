package com.bcc.data.entity;

import static javax.persistence.FetchType.LAZY;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.apache.tomcat.jni.Library;

/**
 * Student
 *
 * @author Kevin Hagel
 * @since 2022-01-29
 */
@Data
@EqualsAndHashCode(exclude = {"id"})
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student implements Serializable {

  private static final long serialVersionUID = -7669190197941349079L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id = -1l;

  @JsonAlias("first_name")
  private String firstName;
  private String familyName;
  private String homePhoneNumber;
  private String cellPhoneNumber;
  private String dateOfBirth;
  private String email;
  private String notes;
  private boolean active;


  @OneToMany
  @JoinTable(name = "school_term_enrollment",
    joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "school_term_id",
      referencedColumnName = "id"))
  private Set<SchoolTerm> schoolTerms = new HashSet<>(0);


  @OneToMany
  @JoinTable(name = "course_term_enrollment",
    joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "course_term_id",
      referencedColumnName = "id"))
  private Set<CourseTerm> courseTerms = new HashSet<>(0);


  @ManyToMany(targetEntity = Contact.class, fetch = LAZY,
    cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}
  )
  @JoinTable(name = "student_contact",
    joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "contact_id", referencedColumnName = "id"))
  private Set<Contact> contacts = new HashSet<>(0);


  /**
   * A student may have 0 to many registrations, but a registration can only have one student.
   */
  @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
  private Set<Registration> registrations = new HashSet<>(0);


  @ManyToMany(targetEntity = Folder.class, fetch = LAZY,
    cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}
  )
  private Set<Folder> folders = new HashSet<>(0);
}
