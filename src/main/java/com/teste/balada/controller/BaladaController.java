package com.teste.balada.controller;

import com.teste.balada.entity.BaladaEntity;
import com.teste.balada.service.BaladaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conhecimento")
public class BaladaController {

  private final BaladaService service;

  public BaladaController(BaladaService service) { this.service = service; }

  @GetMapping
  public List<BaladaEntity> findConhecimentoAll(){ return this.service.findConhecimentoAll(); }

  @PostMapping
  public String postConhecimento(@RequestBody BaladaEntity conhecimento){

    String x = this.service.verificaIdade(conhecimento);
    if (x != null) {
      return x;
    }
    return this.service.postConhecimento(conhecimento);
  }

  @PutMapping("/{id}")
  public String putConhecimento(@PathVariable("id") Integer id, @RequestBody BaladaEntity conhecimento){
    String x = this.service.verificaIdade(conhecimento);
    if (x != null) {
      return x;
    }
    return this.service.putConhecimento(id, conhecimento);
  }

  @DeleteMapping("/{id}")
  public String deleteConhecimento(@PathVariable("id") Integer id){

    return this.service.deleteConhecimento(id);
  }

}
