package com.pppcar.dao;

import com.pppcar.pojo.User;

public interface UserDao {
	public void saveUser(User user);
	public default double sqrt(int a) {
        return Math.sqrt(a);
    }

}
