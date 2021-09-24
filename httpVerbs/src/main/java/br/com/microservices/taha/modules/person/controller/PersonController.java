package br.com.microservices.taha.modules.person.controller;

import java.util.Arrays;
import java.util.List;

import javax.print.attribute.standard.Media;

import lombok.AllArgsConstructor;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservices.taha.modules.person.model.Person;
import br.com.microservices.taha.modules.person.service.PersonService;

@RestController
@AllArgsConstructor
@RequestMapping("/api/persons")
public class PersonController {

	private final PersonService personService;

	@GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Person show(@PathVariable("id") Long personId) {
		return this.personService.findById(personId);
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Person> index() {
		return this.personService.mockedPeople();
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Person store(@RequestBody Person person) {
		return this.personService.create(person);
	}
}
