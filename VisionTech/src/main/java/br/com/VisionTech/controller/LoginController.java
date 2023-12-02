package br.com.VisionTech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.VisionTech.model.ContatoModel;
import br.com.VisionTech.model.LoginModel;
import br.com.VisionTech.repository.LoginRepository;

@Controller
public class LoginController {
@Autowired
private LoginRepository loginRepository;
	@GetMapping({"/login"})
public String home(ModelMap model) {
		model.addAttribute("login",loginRepository.findAll());
        return "html/login";
	}

        @PostMapping(value="/logar")
    	public String logarUsuario(ModelMap model,@ModelAttribute("logarModel") LoginModel loginModel) {
    			
    		System.out.println("usuario" + loginModel.getUsuario());
    		
    		//model.addAttribute("login",loginRepository.findAll());

    		loginRepository.save(loginModel);
    	    
    		return "html/contato";

        }
	}
