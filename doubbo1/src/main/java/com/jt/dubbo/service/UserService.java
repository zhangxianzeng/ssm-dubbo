package com.jt.dubbo.service;

import java.util.List;

import com.jt.dubbo.pojo.User;



public interface UserService {
	
	//根据userId查询购物车信息http://cart.jt.com/cart/query/{userId}
	public List<User> findByUser();
	
	
	
}
