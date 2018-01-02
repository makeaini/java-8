package com.lianyi.map;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.lianyi.entity.Staff;
import com.lianyi.entity.StaffPublic;

public class MapTest {
	public void test1() {
		List<String> alpha = Arrays.asList("a", "b", "c", "d");
		// Java 8
		List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect); // [A, B, C, D]
	}

	public void test2() {
		List<Staff> staff = Arrays.asList(new Staff("mkyong", 30, new BigDecimal(10000)),
				new Staff("jack", 27, new BigDecimal(20000)), new Staff("lawrence", 33, new BigDecimal(30000)));
		List<String> names = staff.stream().map(x -> x.getName()).collect(Collectors.toList());
		System.out.println(names);

	}

	public void test3() {
		List<Staff> staff = Arrays.asList(new Staff("mkyong", 30, new BigDecimal(10000)),
				new Staff("jack", 27, new BigDecimal(20000)), new Staff("lawrence", 33, 
						new BigDecimal(30000)));
		List<StaffPublic> list = staff.stream().map(temp ->{
			StaffPublic obj = new StaffPublic();
			obj.setName(temp.getName());
			obj.setAge(temp.getAge());
			if("mkyong".equals(temp.getName())) {
				obj.setExtra("this field is for mkyong olny!");
			}
			return obj;
			
		}).collect(Collectors.toList());
		System.out.println(list);

	}

	public static void main(String[] args) {
		MapTest mapTest = new MapTest();
		mapTest.test3();
	}

}
