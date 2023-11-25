package br.com.VisionTech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.VisionTech.model.ContatoModel;

@Repository
public interface ContatoRepository extends JpaRepository<ContatoModel, Long>{

}