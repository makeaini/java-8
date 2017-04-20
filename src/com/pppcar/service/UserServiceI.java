package com.pppcar.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class UserServiceI {
	public Optional<List<User>> getUsers2() {
		// 假裝從資料庫取值
		List<User> users = Arrays.asList(new User(1, "Tony"), new User(2, "John"), new User(3, "Emma"));
		return Optional.ofNullable(users);
	}
	public static void main(String[] args) {
		UserServiceI i =new UserServiceI();
		Predicate<User> predicate=p -> (p.getId()==1);
		i.getUsers2().get().forEach(item->{
			if(item.getId() == 1){
				System.out.println(item);
			}
		});
	}

}
