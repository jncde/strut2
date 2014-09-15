package com.bjsxt.struts2.wildcard.action;

import com.opensymphony.xwork2.ActionSupport;

public class TeacherAction extends ActionSupport {
	public String add() {
		return SUCCESS;
	}
	
	public String add2() {
		return "fail";
	}
	
	public String delete() {
		return SUCCESS;
	}
	public String delete2() {
		return "fail";
	}
	
	
}
