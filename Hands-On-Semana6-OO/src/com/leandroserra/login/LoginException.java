package com.leandroserra.login;

public class LoginException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String login;

	public LoginException(String message, String login) {
		super(message);
		this.login = login;
	}

	public String getLogin() {
		return login;
	}	
	

}
