package br.com.VisionTech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.VisionTech.model.LoginModel;

@Repository
public interface LoginRepository extends JpaRepository<LoginModel, Long>{

}