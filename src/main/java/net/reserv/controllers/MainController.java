package net.reserv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@Autowired
	// private VueJS vue;

	// private String restURL = "http://127.0.0.1:8080/";

	@RequestMapping("/")

	public String index() {

		return "index";
	}
}
