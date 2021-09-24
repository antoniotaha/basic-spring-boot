package br.com.microservices.taha.modules.person.model;

import java.io.Serializable;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@EqualsAndHashCode(of = "id")
public class Person implements Serializable {

	private Long id;

	private String name;

	private String lastName;

	private String address;

	private String gender;
}
