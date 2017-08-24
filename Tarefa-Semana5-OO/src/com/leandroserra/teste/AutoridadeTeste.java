package com.leandroserra.teste;

import static org.junit.Assert.*;
import org.junit.Test;

import com.leandroserra.tarefa.Autoridade;
import com.leandroserra.tarefa.ComTitulo;
import com.leandroserra.tarefa.FormatadorNome;
import com.leandroserra.tarefa.Informal;
import com.leandroserra.tarefa.Respeitoso;

public class AutoridadeTeste {
	
	Autoridade autoridade;
	FormatadorNome fn;
	
	@Test
	public void testeGetNome(){
		autoridade = new Autoridade("Leandro", "Serra");
		assertEquals(true, autoridade.getNome().equals("Leandro"));
	}
	@Test
	public void testeGetSobreNome(){
		autoridade = new Autoridade("Leandro", "Serra");
		assertEquals(true, autoridade.getSobreNome().equals("Serra"));
	}	
	@Test
	public void testeAutoridadeInformal(){
		autoridade = new Autoridade("Leandro", "Serra", fn = new Informal());  
		assertEquals(true, autoridade.getTratamento().equals("Leandro"));
	}	
	@Test
	public void testeAutoridadeRespeitoso(){
		autoridade = new Autoridade("Leandro", "Serra", fn = new Respeitoso("masculino"));  
		assertEquals(true, autoridade.getTratamento().equals("Sr. Serra"));
		autoridade = new Autoridade("Amanda", "Trigueiro", fn = new Respeitoso("feminino"));  
		assertEquals(true, autoridade.getTratamento().equals("Sra. Trigueiro"));
	}
	@Test
	public void testeComTitulo(){
		autoridade = new Autoridade("Leandro", "Serra", fn = new ComTitulo("Magnífico"));  
		assertEquals(true, autoridade.getTratamento().equals("Magnífico Leandro Serra"));
	}	
}
