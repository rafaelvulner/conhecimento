package com.teste.balada.repository;

import com.teste.balada.entity.BaladaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaladaRepository extends JpaRepository<BaladaEntity, Integer> {

    void deleteById(Integer id);
}
