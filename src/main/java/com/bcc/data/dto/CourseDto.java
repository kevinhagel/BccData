package com.bcc.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * CourseDto is a dto transferring a Course entity to the rest client.
 *
 * @author Kevin Hagel
 * @version 2022-01-29
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class CourseDto {
  private String id;
  private String name;

}
