package net.reserv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import io.github.jeemv.springboot.vuejs.VueJS;

@Controller
public class MainController {

	@Autowired
	private VueJS vue;

	private String URL = "http://127.0.0.1:8080/";

}
