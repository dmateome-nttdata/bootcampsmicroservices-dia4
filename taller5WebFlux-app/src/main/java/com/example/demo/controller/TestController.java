package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class TestController {
	
	private static final String VISTA="personList";

	@Autowired
	PersonService personService;

	@GetMapping("/personAll")
	public String personList2(final Model model) {
		final Flux<Person> personlist = personService.getAllPerson();
		
		model.addAttribute("personlist", personlist);
		
		return "personList";
	}
}
