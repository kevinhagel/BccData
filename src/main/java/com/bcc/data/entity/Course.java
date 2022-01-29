package com.bcc.data.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Course is a course students take.  The data in the course table doesn't change often.  A more important 'entity' class
 * is CourseTerm.  A student is enrolled in a CourseTerm
 *
 * @author Kevin Hagel
 * @since 2022-01-29
 */
@Data
@EqualsAndHashCode(exclude = {"id"})
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "course")
public class Course implements Serializable {

  private static final long serialVersionUID = 6699414812433165798L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id = -1l;

  @Column(unique=true)
  private String name;
  private String description;

  @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
  private Set<CourseTerm> courseTerms = new HashSet<>(0);

}
