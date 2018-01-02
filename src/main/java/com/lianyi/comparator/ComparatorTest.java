package com.lianyi.comparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.lianyi.entity.Developer;

public class ComparatorTest {
	public void test1() {
		List<Developer> listDevs = getDevelopers();
		listDevs.sort((Developer o1,Developer o2)->o1.getAge()-o2.getAge());
		listDevs.forEach((develpoer)->System.out.println(develpoer));
	}
	public void test2() {
		List<Developer> listDevs = getDevelopers();
		Comparator<Developer> salaryComparator = (o1, o2)->o1.getAge().compareTo(o2.getAge());
		listDevs.sort(salaryComparator);
		listDevs.forEach((Developer develpoer)->System.out.println(develpoer));
	}
	public static void main(String[] args) {
		ComparatorTest comparatorTest = new ComparatorTest();
		comparatorTest.test2();
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));

		return result;

	}

}
