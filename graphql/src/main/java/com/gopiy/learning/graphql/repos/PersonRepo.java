package com.gopiy.learning.graphql.repos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.gopiy.learning.graphql.models.Person;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PersonRepo {
	private List<Person> members = new ArrayList<>();

	public List<Person> getMembers() {
		return this.members;
	}

	public Person getMemberById(int id) {
		List<Person> matched = this.members.stream().filter(m -> m.getId() == id).collect(Collectors.toList());
		if (matched.size() > 0)
			return matched.get(0);

		return null;
	}

	public Person createMember(String name, int age) {
		Person newPerson = new Person(this.members.size() + 1, name, age);
		this.members.add(newPerson);
		return newPerson;
	}
}
