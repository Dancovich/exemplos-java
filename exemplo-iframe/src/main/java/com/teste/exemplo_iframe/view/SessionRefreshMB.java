package com.teste.exemplo_iframe.view;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named
public class SessionRefreshMB implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void refreshSession(){
		//a função não tem que fazer nada realmente.
		System.out.println("TESTE!!!!!");
	}

}
