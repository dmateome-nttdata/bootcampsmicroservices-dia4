package com.example.demo.controller;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Person;

import reactor.core.publisher.Flux;

@RestController
public class TestController {

	@GetMapping("/person-list-1")
	public Flux<Person> personList1() {
		Person p = new Person("Jack", "Williams", 47);
		return Flux.just(p).delayElements(Duration.ofSeconds(2));
	}

	@GetMapping("/person-list-2")
	public Flux<Person> personList2() {
		Person p = new Person("person1", "sdad", 5);
		return Flux.just(p).delayElements(Duration.ofSeconds(2));

	}

	@GetMapping("/person-list-3")
	public Flux<Person> personList3() {
		Person p = new Person("person2", "asdad", 5);
		return Flux.just(p).delayElements(Duration.ofSeconds(2));

	}

	@GetMapping("/person-list-4")
	public Flux<Person> personList4() {
		Person p = new Person("person3", "sda", 5);
		return Flux.just(p).delayElements(Duration.ofSeconds(2));

	}
}
