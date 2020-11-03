package net.reserv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.jeemv.springboot.vuejs.VueJS;

@Controller
public class MainController {
<<<<<<< HEAD
	
	@Autowired
	 private VueJS vue;

	 private String restURL = "http://127.0.0.1:8080/";

	@RequestMapping("/index.html")
=======

	@Autowired
	 private VueJS vue;

	private String restURL = "http://127.0.0.1:8080/";

	@RequestMapping("/")
>>>>>>> 9dce9ae89c21b918d936a9f82d6a71fdfba04a1b
	public String index() {

		return "index";
	}
<<<<<<< HEAD
	
=======
>>>>>>> 9dce9ae89c21b918d936a9f82d6a71fdfba04a1b
}
