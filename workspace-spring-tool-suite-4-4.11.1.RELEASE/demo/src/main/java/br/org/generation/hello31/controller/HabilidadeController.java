package br.org.generation.hello31.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
public class HabilidadeController {

		@GetMapping
		public String habilidades() {
			return "Nosso foco é trabalhar em equipe. <br /> Orientação ao futuro";
					
		}
		


	
}
