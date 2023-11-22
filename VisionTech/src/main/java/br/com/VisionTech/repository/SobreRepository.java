package br.com.VisionTech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.VisionTech.model.SobreModel;

@Repository
public interface SobreRepository extends JpaRepository<SobreModel, Long>{

}