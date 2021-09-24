package br.com.microservices.taha.modules.person.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.microservices.taha.modules.person.model.Person;

@Service
public class PersonService {

	private final AtomicLong counter = new AtomicLong();

	public Person findById(Long id) {
		return this.buildPerson(id);
	}

	public Person create(Person person) {
		if(person != null) {
			person.setId(counter.incrementAndGet());
			return person;
		}

		return null;
	}

	public List<Person> mockedPeople() {
		List<Person> people = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			people.add(this.buildPerson(Long.valueOf(i)));
		}

		return people;
	}

	private Person buildPerson(Long i) {
		return Person.builder().id(counter.incrementAndGet())
				.name("Antonio " + i)
				.lastName("Taha " + i)
				.gender("Male")
				.address("SA")
				.build();
	}

}
