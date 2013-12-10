package com.test;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TestBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String test = "Some String";

	
	public String getTest() {
		return test;
	}

	
	public void setTest(String test) {
		this.test = test;
	}
}
