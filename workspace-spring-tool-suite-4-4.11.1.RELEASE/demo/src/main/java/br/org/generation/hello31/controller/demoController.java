package br.org.generation.hello31.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class demoController {

		@GetMapping
		public String hello() {
			return "Hello World!";
		}
}
