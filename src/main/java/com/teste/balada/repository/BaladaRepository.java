package com.teste.balada.repository;

import com.teste.balada.entities.BaladaEntity;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class BaladaRepository {

  private List<BaladaEntity> entityList = new ArrayList<>();

  public List<BaladaEntity> getConhecimento(){
    return this.entityList;
  }

  public String postConhecimento(BaladaEntity conhecimento){

    this.entityList.add(conhecimento);
    return "Adicionado com sucesso!";
  }

  public String putConhecimento(Integer id, BaladaEntity conhecimento){

    if(this.entityList.contains(conhecimento)){
      this.entityList.get(id).setNome(conhecimento.getNome());
      this.entityList.get(id).setIdade(conhecimento.getIdade());
    }else{
      return "Esse cara não existe! ";
    }
    return "Atualizado com sucesso!";
  }

  public String deleteConhecimento(Integer id){

    this.entityList.remove(id);
    return "Deletado com sucesso! ";
  }

}
