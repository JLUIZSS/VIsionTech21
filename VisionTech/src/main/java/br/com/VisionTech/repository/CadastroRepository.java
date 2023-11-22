package br.com.VisionTech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.VisionTech.model.CadastroModel;

@Repository
public interface CadastroRepository extends JpaRepository<CadastroModel, Long>{

}