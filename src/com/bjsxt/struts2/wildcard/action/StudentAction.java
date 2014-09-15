package com.bjsxt.struts2.wildcard.action;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport {
	public String add() {
		return SUCCESS;
	}
	public String add2() {
		return "fail";
	}
	public String delete() {
		return SUCCESS;
	}
	
}
