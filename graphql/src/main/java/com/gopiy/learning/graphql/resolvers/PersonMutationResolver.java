package com.gopiy.learning.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.gopiy.learning.graphql.models.Person;
import com.gopiy.learning.graphql.repos.PersonRepo;

public class PersonMutationResolver implements GraphQLMutationResolver {
	private PersonRepo personRepo;

	public PersonMutationResolver(PersonRepo personRepo) {
		this.personRepo = personRepo;
	}

	public Person addMember(String name, int age) {
		return personRepo.createMember(name, age);
	}
}
