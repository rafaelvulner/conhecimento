package com.teste.balada.controller;

import com.teste.balada.entities.BaladaEntity;
import com.teste.balada.service.BaladaService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conhecimento")
public class BaladaController {

  private BaladaService service;

  public BaladaController(BaladaService service) {
    this.service = service;
  }

  @GetMapping
  public List<BaladaEntity> getConhecimentos(){
    return this.service.getConhecimento();
  }

  @PostMapping
  public String postConhecimentos(@RequestBody BaladaEntity conhecimento){

    String x = verificaIdade(conhecimento);
    if (x != null) {
      return x;
    }
    return this.service.postConhecimento(conhecimento);
  }

  @PutMapping("/{id}")
  public String putConhecimentos(@PathVariable Integer id, @RequestBody BaladaEntity conhecimento){
    String x = verificaIdade(conhecimento);
    if (x != null) {
      return x;
    }
    return this.service.putConhecimento(id, conhecimento);
  }

  @DeleteMapping("/{id}")
  public String deleteConhecimentos(@PathVariable Integer id){
    return this.service.deleteConhecimento(id);
  }

  private String verificaIdade(BaladaEntity conhecimento) {
    if(conhecimento.getIdade() < 18){
      return "É proibido a entrada de pessoas com menos de 18 anos.";
    }
    return null;
  }

}
