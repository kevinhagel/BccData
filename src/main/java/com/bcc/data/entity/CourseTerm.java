package com.bcc.data.entity;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
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
 * CourseTerm is a relation between a Course and an embedded Term.  A Course has many CourseTerms, but a CourseTerm has
 * only one course.
 *
 * @author Kevin Hagel
 * @since 2022-03-03
 */
@Data
@EqualsAndHashCode(exclude = {"id"})
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="course_term")
public class CourseTerm implements Serializable {

  private static final long serialVersionUID = -4711275730086199893L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id = -1l;

  @ManyToOne(optional = false)
  @JoinColumn(name="course_id", nullable = false, referencedColumnName = "id")
  private Course course;

  private String notes;
  private String description;

  @Embedded
  @AttributeOverrides({
    @AttributeOverride( name = "startDate", column = @Column(name = "start_date")),
    @AttributeOverride( name = "endDate", column = @Column(name = "end_date"))
  })
  private Term term;
}
