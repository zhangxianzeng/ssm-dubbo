package com.jt.dubbo.pojo;

import javax.persistence.Table;

import com.jt.common.po.BasePojo;

@Table(name="userssm")
//必须要继承一个序列化
public class User extends BasePojo {
private String username;
private String password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
