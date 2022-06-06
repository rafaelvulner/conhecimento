package com.teste.balada.entity;


import lombok.*;

import javax.persistence.*;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
public class BaladaEntity {

  @Id
  private Integer id;

  private String nome;

  private Integer idade;

}