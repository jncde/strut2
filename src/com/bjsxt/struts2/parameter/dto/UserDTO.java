package com.bjsxt.struts2.parameter.dto;

public class UserDTO {
	private String name;
	private String password;
	private String confirmingPassword;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmingPassword() {
		return confirmingPassword;
	}
	public void setConfirmingPassword(String confirmingPassword) {
		this.confirmingPassword = confirmingPassword;
	}
	
	
}
