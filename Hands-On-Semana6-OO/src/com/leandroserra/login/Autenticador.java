package com.leandroserra.login;

public class Autenticador {
	
	public Usuario logar(String login, String senha) throws LoginException{
		if (login.equals("leandro") && senha.equals("javaoo")) {
			return new Usuario(login);
		}
		throw new LoginException("O usuário e a senha não conferem!", login);
	}
	
}
