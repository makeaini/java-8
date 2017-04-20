package com.pppcar.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.pppcar.pojo.Person;

public class PersonServiceI {
	List<Person> javaProgrammers = new ArrayList<Person>() {
		/**
		* 
		*/
		private static final long serialVersionUID = -9210187870737276638L;

		{
			add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
			add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
			add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
			add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
			add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));
			add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
			add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));
			add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
			add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));
			add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));
		}
	};
	List<Person> phpProgrammers = new ArrayList<Person>() {

		private static final long serialVersionUID = 201986408194451106L;

		{
			add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));
			add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));
			add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));
			add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));
			add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));
			add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));
			add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));
			add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));
			add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));
			add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));
		}
	};

	public void foreachPerson() {
		javaProgrammers.stream().forEach(p -> System.out.printf("%s,%s;", p.getFirstName(), p.getLastName()));

	}

	public void filterPerson() {
		phpProgrammers.stream().filter(p -> (p.getSalary() > 1400))
				.forEach(p -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));
	}

	public void limitPerson() {
		phpProgrammers.stream().limit(3).filter(p -> (p.getSalary() > 1400))
				.forEach(p -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));
	}

	public void sortPerson() {
		javaProgrammers.stream().sorted((p, p2) -> (p.getFirstName().compareTo(p2.getFirstName())))
				.collect(Collectors.toList()).forEach(p -> System.out.printf("%s;", p.getFirstName()));
	}

	public void minPerson() {
		Person pers = javaProgrammers.stream().min((p1, p2) -> (p1.getSalary() - p2.getSalary())).get();
		System.out.println(pers.getSalary());
	}

	public void nameList() {
		List<String> lists = javaProgrammers.stream().map(p -> p.getFirstName()).collect(Collectors.toList());
		// lists.forEach(item->System.out.println(item));
		lists.forEach(item -> {
			if (item.equals("Elsdon")) {
				System.out.println(item);
			}
		});
	}

	public void mapforeach() {
		Map<String, Person> map = new HashMap<String, Person>();
		map.put("1", new Person("111"));
		map.put("2", new Person("222"));
		map.put("3", new Person("333"));
		map.put("4", new Person("4444"));
		map.forEach((key, value) -> System.out.println("key:" + key + ";value:" + value));
	}

	public void aa() {
		List<String> name = new ArrayList<String>();
		name.add("aaa");
		List<String>   b= new ArrayList<String>(); 
		String bbb = null;
		String ss = Optional.of(bbb).get();
		System.out.println(ss);
		List<String> aaa=Optional.ofNullable(name).map(result -> result).orElse(b);
		System.out.println(aaa);
	}
	public void nameNull() {
	    String name = null;
	    Optional<String> optName = Optional.ofNullable(name);//of method make NPE Boom
	    System.out.println(optName.get());
	}
	public String test(String name) throws Exception{
		return Optional.ofNullable(name).orElseGet(()->"is null");
	}

	public static void main(String[] args) {
		PersonServiceI i = new PersonServiceI();
		try {
			System.out.println(i.test(null));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * public List<String> user() { List<String> names = new
	 * ArrayList<String>(); names.add("bBb"); names.add("aAa");
	 * names.add("cCc"); Collections.sort(names, (o1, o2) -> o1.compareTo(o2));
	 * return names; } public static void main(String[] args) { PersonServiceI
	 * serviceI=new PersonServiceI(); List<String> kk =
	 * serviceI.user().stream().map((name)->{ return
	 * name.toLowerCase();}).collect(Collectors.toList());
	 * System.out.println(kk);
	 * 
	 * }
	 */
}
