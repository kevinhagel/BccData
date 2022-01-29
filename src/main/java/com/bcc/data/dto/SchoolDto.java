package com.bcc.data.dto;

import com.bcc.data.entity.School;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * SchoolDto is a dto transferring {@link School} information to the rest client.
 *
 * @author Kevin Hagel
 * @version 2022-01-29
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class SchoolDto {
  private Long id;
  private String name;
  private List<String> contacts;
  private String contactName;
  private String contactPhone;
  private String addressStreet;
  private String addressCity;
  private String notes;
  private List<String> defaultClassesList = new ArrayList<>();
}
