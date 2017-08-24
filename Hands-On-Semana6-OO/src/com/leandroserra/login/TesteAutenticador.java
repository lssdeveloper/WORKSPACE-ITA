package com.leandroserra.login;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class TesteAutenticador {

	@Test
	public void loginComSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("leandro", "javaoo");
		assertEquals("leandro", u.getLogin());
	}
	@Test(expected=LoginException.class)
	public void loginInvalido() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("leandro", "senhaErrada");
	}
	//Como retornar a informação do erro
	@Test
	public void informaçãoDoErro(){
		Autenticador a = new Autenticador();
		try {
			Usuario u = a.logar("leandro", "senhaErrada");
			fail();  
		} catch (LoginException e) {
			assertEquals("leandro", e.getLogin());
		}
	}
}
