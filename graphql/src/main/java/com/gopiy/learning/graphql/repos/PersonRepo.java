package com.gopiy.learning.graphql.repos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.gopiy.learning.graphql.models.Person;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PersonRepo {
	private List<Person> members = new ArrayList<>();

	public List<Person> getMembers() {
		return members;
	}
}
