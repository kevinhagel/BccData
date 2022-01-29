package com.bcc.data.entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Term is an embeddable JPA object containg a start date and an end date.
 *
 * @author Kevin Hagel
 * @since 19.02.22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Term implements Serializable {

  private static final long serialVersionUID = -598557267111563973L;
  private LocalDate startDate;
  private LocalDate endDate;

}
