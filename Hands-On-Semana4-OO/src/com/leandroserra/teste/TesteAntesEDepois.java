package com.leandroserra.teste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TesteAntesEDepois {
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("@BeforeClass");
	}
	@Before
	public void before(){
		System.out.println("@Before");
	}
	@Test
	public void teste1(){
		System.out.println("Teste 1");
	}
	@Test
	public void teste2(){
		System.out.println("Teste 2");
	}
	@Test
	public void teste3(){
		System.out.println("Teste 3");
	}
	@After
	public void after(){
		System.out.println("@After");
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("@AfterClass");
	}

}
