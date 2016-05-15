package com.common;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="bkHome")
@SessionScoped
public class BKHome implements Serializable {
	
	private String username;
	private String password;
	
	@PostConstruct
	public void init() {
		try {
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void action_test() {
		System.out.println("::action_test::");
		try {
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

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
