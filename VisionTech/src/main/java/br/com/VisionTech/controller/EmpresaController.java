package br.com.VisionTech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.VisionTech.repository.EmpresaRepository;

@Controller
public class EmpresaController {
@Autowired
private EmpresaRepository empresaRepository;
	@GetMapping({"/PaginaInicial"})
public String home(ModelMap model) {
		model.addAttribute("empresa",empresaRepository.findAll());
         return "html/PaginaInicial";



}
	@GetMapping({"/"})
public String principal(ModelMap model) {
		model.addAttribute("empresa",empresaRepository.findAll());
         return "html/PaginaInicial";



}
}