package com.bcc.data.entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Registration a student registers every term they will attend.  This is separate from Enrollment, a student
 * may enroll in many course terms in one year.  But they may only register once each term.
 *
 * @author Kevin Hagel
 * @since 2022-03-03
 */
@Data
@EqualsAndHashCode(exclude = {"id"})
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="registration")
public class Registration implements Serializable {

  private static final long serialVersionUID = 7855159390536495040L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id = -1l;

  @ManyToOne(optional = false)
  @JoinColumn(name="student_id", nullable = false, referencedColumnName = "id")
  private Student student;

  private LocalDate localDate;
  private Boolean expired;
}
