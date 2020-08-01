package com.gopiy.learning.graphql.resolvers;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.gopiy.learning.graphql.models.Person;
import com.gopiy.learning.graphql.repos.PersonRepo;

public class PersonQueryResolver implements GraphQLQueryResolver {
	private PersonRepo personRepo;

	public PersonQueryResolver(PersonRepo personRepo) {
		this.personRepo = personRepo;
	}

	public List<Person> members() {
		return personRepo.getMembers();
	}

	public Person memberById(int id) {
		return personRepo.getMemberById(id);
	}
}
