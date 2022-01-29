package com.bcc.data.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User only needs a unique id, since we're goig to be using OAuth, probably openid, all we need is a unique string
 * identifier.
 *
 * @author Kevin Hagel
 * @since 2022-02-26
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class User implements Serializable {

  private static final long serialVersionUID = 6032926905488021268L;

  @Id
  private String id;
  private String name;
  private String email;
  private String phone;

}
