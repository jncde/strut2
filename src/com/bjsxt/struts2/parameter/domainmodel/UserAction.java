package com.bjsxt.struts2.parameter.domainmodel;

import com.bjsxt.struts2.parameter.domainmodel.User;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	private User user;
	//private UserDTO userDTO;
	public String add() {
		System.out.println("name=" + user.getName());
		System.out.println("age=" + user.getAge());
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
