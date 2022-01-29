package com.bcc.data.entity;

import java.io.Serializable;
import java.time.Period;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * SchoolTerm
 *
 * @author Kevin Hagel
 * @since 13.02.22
 */
@Data
@EqualsAndHashCode(exclude = {"id"})
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SchoolTerm implements Serializable {

  private static final long serialVersionUID = -324234234234234L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id = -1l;

  @ManyToOne(optional = false)
  @JoinColumn(name="school_id", nullable = false, referencedColumnName = "id")
  private School school;

  private String notes;
  private String description;

  @Embedded
  @AttributeOverrides({
    @AttributeOverride( name = "startDate", column = @Column(name = "term_start_date")),
    @AttributeOverride( name = "endDate", column = @Column(name = "term_end_date"))
  })
  private Term term;

}
