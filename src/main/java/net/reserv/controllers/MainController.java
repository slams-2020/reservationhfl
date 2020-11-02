package net.reserv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.jeemv.springboot.vuejs.VueJS;

@Controller
public class MainController {

	@Autowired
	 private VueJS vue;

	private String restURL = "http://127.0.0.1:8080/";

	@RequestMapping("/")
	public String index() {

		return "index";
	}
}
