package br.com.VisionTech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.VisionTech.model.ContatoModel;
import br.com.VisionTech.repository.ContatoRepository;

@Controller
public class ContatoController {
@Autowired
private ContatoRepository contatoRepository;
	@GetMapping({"/contato"})
public String home(ModelMap model) {
		model.addAttribute("contato",contatoRepository.findAll());
        return "html/contato";
}
	
	@PostMapping(value="/contato_usuario")
	public String cadastrarUsuario(ModelMap model,@ModelAttribute("contatarModel") ContatoModel contatoModel) {
			
		System.out.println("nome" + contatoModel.getNome());
		
		//model.addAttribute("contato",contatoRepository.findAll());
		contatoRepository.save(contatoModel);
	    
		return "html/contato";



	}
}