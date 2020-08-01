package com.gopiy.learning.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gopiy.learning.graphql.repos.PersonRepo;
import com.gopiy.learning.graphql.resolvers.PersonMutationResolver;
import com.gopiy.learning.graphql.resolvers.PersonQueryResolver;

@SpringBootApplication
public class GraphqlApplication {
	@Autowired
	PersonRepo personRepo;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	@Bean
	public PersonQueryResolver personQueryResolver(PersonRepo personRepo) {
		return new PersonQueryResolver(personRepo);
	}

	@Bean
	public PersonMutationResolver personMutationResolver(PersonRepo personRepo) {
		return new PersonMutationResolver(personRepo);
	}
}
