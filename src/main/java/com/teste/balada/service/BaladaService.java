package com.teste.balada.service;

import com.teste.balada.entity.BaladaEntity;
import com.teste.balada.repository.BaladaRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BaladaService {

  private BaladaRepository repository;

  public BaladaService(BaladaRepository repository) {
    this.repository = repository;
  }

  public List<BaladaEntity> getConhecimento(){
    return this.repository.getConhecimento();
  }

  public String postConhecimento(BaladaEntity conhecimento){

    this.repository.postConhecimento(conhecimento);
    return "Adicionado com sucesso!";
  }

  public String putConhecimento(Integer id, BaladaEntity conhecimento){

    this.repository.putConhecimento(id, conhecimento);
    return "Atualizado com sucesso!";
  }

  public String deleteConhecimento(Integer id){

    this.repository.deleteConhecimento(id);
    return "Deletado com sucesso! ";
  }
}
