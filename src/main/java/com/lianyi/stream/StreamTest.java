package com.lianyi.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.lianyi.entity.Person;

public class StreamTest {
	public void test1() {
		List<String> lines = Arrays.asList("spring", "node", "mkyong");
		List<String> strings = lines.stream().filter((line) -> !"spring".equals(line)).collect(Collectors.toList());
		System.out.println(strings);
	}

	public void test2() {
		List<Person> persons = Arrays.asList(new Person("mkyong", 30), new Person("jack", 33), new Person("jack", 20),
				new Person("lawrence", 40));
		Person person = persons.stream().filter((x) -> "jack".equals(x.getName()) && 201 == x.getAge()).findAny()
				.orElse(null);
		System.out.println(person);
	}

	public void test3() {
		List<Person> persons = Arrays.asList(new Person("mkyong", 30), new Person("jack", 20),
				new Person("lawrence", 40));
		String name = persons.stream().filter(x -> "jack".equals(x.getName())).map(Person::getName) // convert stream to
				.findAny().orElse("");

		System.out.println("name : " + name);
		List<String> collect = persons.stream().map(Person::getName).collect(Collectors.toList());

		collect.forEach(System.out::println);
	}

	public static void main(String[] args) {
		StreamTest streamTest = new StreamTest();
		streamTest.test3();
	}
}
