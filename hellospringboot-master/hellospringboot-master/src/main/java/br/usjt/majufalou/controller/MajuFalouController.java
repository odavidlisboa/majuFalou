package br.usjt.majufalou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MajuFalouController {
	@GetMapping ("/hello")
	public String hello() {
		return "hello_spring_boot";
	}
}