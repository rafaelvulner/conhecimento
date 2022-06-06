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

  public List<BaladaEntity> findConhecimentoAll(){
    return this.repository.findAll();
  }

  public String postConhecimento(BaladaEntity conhecimento){
      this.verificaIdade(conhecimento);
      this.repository.save(conhecimento);
      return "Adicionado com sucesso!";

  }

  public String putConhecimento(Integer id, BaladaEntity conhecimento){
      this.existeId(id);
      this.repository.save(conhecimento);
      return "Editado com sucesso";

  }

  public String deleteConhecimento(Integer id){
      this.existeId(id);
      this.repository.deleteById(id);
      return "Deletado com sucesso";

  }

  private void existeId (Integer id) {
    if (!this.repository.existsById(id))
      throw new RuntimeException("Usuario não existe");
  }

    public void verificaIdade(BaladaEntity conhecimento) {
        if(conhecimento.getIdade() < 18)
            throw new RuntimeException("Usuario proibido! menor de idade");

    }
}
