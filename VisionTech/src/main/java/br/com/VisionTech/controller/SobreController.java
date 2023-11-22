package br.com.VisionTech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.VisionTech.repository.SobreRepository;

@Controller
public class SobreController {
@Autowired
private SobreRepository sobreRepository;
	@GetMapping({"/sobre"})
public String home(ModelMap model) {
		model.addAttribute("sobre", sobreRepository.findAll());
        return "html/sobre";



}
}