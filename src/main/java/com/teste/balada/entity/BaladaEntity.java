package com.teste.balada.entity;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EntityScan
public class BaladaEntity {

  public Integer id;

  public String nome;

  public Integer idade;
}
