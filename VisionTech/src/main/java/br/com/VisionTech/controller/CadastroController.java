package br.com.VisionTech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.VisionTech.model.CadastroModel;
import br.com.VisionTech.repository.CadastroRepository;

@Controller
public class CadastroController {
@Autowired
private CadastroRepository cadastroRepository;
	@GetMapping({"/cadastrar"})
public String home(ModelMap model) {
		model.addAttribute("cadastro",cadastroRepository.findAll());
        return "html/cadastro";



}
	@PostMapping(value="/cadastrar_usuario")
	public String cadastrarUsuario(ModelMap model,@ModelAttribute("cadastrarModel") CadastroModel cadastroModel) {
			
		System.out.println("email" + cadastroModel.getEmail());
		
		//model.addAttribute("cadastro",cadastroRepository.findAll());
		cadastroRepository.save(cadastroModel);
	    
		return "html/cadastro";



	}
}