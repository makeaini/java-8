package com.lianyi.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForeachTest {
	public void test1() {
		Map<String, Integer> items = new HashMap<String, Integer>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		items.forEach((String key,Integer value)->{
			if(key.equals("A")) {
				System.out.println(key);
				System.out.println(value);
			}
		});
		
	}
	public void test2() {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		items.forEach(item->{
			System.out.println(item);
		});

	}

	public static void main(String[] args) {
		ForeachTest foreachTest = new ForeachTest();
		foreachTest.test1();
		foreachTest.test2();
	}

}
