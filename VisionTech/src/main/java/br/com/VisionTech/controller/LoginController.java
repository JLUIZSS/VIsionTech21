package br.com.VisionTech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.VisionTech.repository.LoginRepository;

@Controller
public class LoginController {
@Autowired
private LoginRepository loginRepository;
	@GetMapping({"/login"})
public String home(ModelMap model) {
		model.addAttribute("cadastro",loginRepository.findAll());
        return "html/login";



}
}