package com.lianyi.entity;

import java.math.BigDecimal;

public class Developer {
	private String name;
	private BigDecimal decimal;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getDecimal() {
		return decimal;
	}

	public void setDecimal(BigDecimal decimal) {
		this.decimal = decimal;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Developer(String name, BigDecimal decimal, Integer age) {
		super();
		this.name = name;
		this.decimal = decimal;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", decimal=" + decimal + ", age=" + age + "]";
	}
	 
	

}
