package com.bjsxt.struts2.parameter.dto;

import com.bjsxt.struts2.parameter.dto.User;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	private UserDTO userDTO;
	private User user;
	
	public String add() {
		System.out.println("name=" + userDTO.getName());
		System.out.println("age=" + userDTO.getPassword());
		System.out.println("age=" + userDTO.getConfirmingPassword());
		if(userDTO.getPassword().equalsIgnoreCase(userDTO.getConfirmingPassword())){
			user=new User();
			user.setName(userDTO.getName());
			user.setPassword(userDTO.getPassword());
		}
		return SUCCESS;
	}

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
	
}
