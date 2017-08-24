package com.leandroserra.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.leandroserra.repository.Filmes;

public class FilmesTeste {
	
	Filmes filmes; 
	
	@Before
	public void iniciar(){
		filmes = new Filmes();
	}
	
	@Test
	public void lstFilmes(){
		
//		assertEquals(8, filmes.lstFilmes().size());
	}

}
