package com.bcc.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * FolderDto
 *
 * @author Kevin Hagel
 * @since 20.02.22
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class FolderDto {
  private Long id;
  private String name;
  private String description;
  private String notes;
}
