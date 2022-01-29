package com.bcc.data.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Folder is a somewhat arbitrary collection of Students, as far as I can tell at this point.  Petko wants to have this
 * as a way of grouping students together.
 *
 * @author Kevin Hagel
 * @since 19.02.22
 */
@Data
@EqualsAndHashCode(exclude = {"id"})
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "folder")
public class Folder implements Serializable {

  private static final long serialVersionUID = -3641751701651519536L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id = -1l;

  private String name;
  private String description;
  private String notes;
  private LocalDate dateCreated;
  private LocalDate lastAccessed;


  @ManyToMany(targetEntity = Student.class, mappedBy = "folders", fetch = FetchType.LAZY, cascade = {
    CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
  private Set<Student> students = new HashSet<>(0);

}
