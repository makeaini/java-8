package com.pppcar.dao;

import com.pppcar.pojo.User;

public class UserDaoImpl implements UserDao{

	@Override
	public void saveUser(User user) {
		
	}
	public static void main(String[] args) {
		UserDao dao = new UserDaoImpl();
		System.out.println(dao.sqrt(123));
	}

}
