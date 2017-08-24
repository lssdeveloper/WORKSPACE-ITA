package com.leandroserra.teste;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Before;
import org.junit.Test;

import com.leandroserra.tarefa.Pessoa;

public class PessoaTestes {
	
	Pessoa p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12;
	LocalDate dtNascimento; 
	DateTimeFormatter  fmt;
	
	@Before
	public void iniciar(){
		p3 = new Pessoa(25, 1, 1975);  	//Aquario
		p4 = new Pessoa(25, 2, 1975);  	//Peixes
		p5 = new Pessoa(25, 3, 1975);	//Aries
		p6 = new Pessoa(25, 4, 1975);	//Touro			
		
		p7 = new Pessoa(25, 5, 1975);  	//Gemeos
		p8 = new Pessoa(25, 6, 1975);  	//Cancer
		p9 = new Pessoa(25, 7, 1975);	//Leao
		p10 = new Pessoa(25, 8, 1975);	//Virgem	
		p11 = new Pessoa(25, 9, 1975);	//Libra
		p12 = new Pessoa(25, 10, 1975);	//Escorpiao		
		
		p1 = new Pessoa(25, 11, 1975);	//Sagitario
		p2 = new Pessoa(25, 12, 1975); 	//Capricornio
	
		dtNascimento = LocalDate.of(1975, 11, 25);
		fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	}
	@Test
	public void testePessoaDataDeNascimento(){

		assertEquals(dtNascimento, p1.getDataDeNascimento());
		
		dtNascimento = LocalDate.of(1975, 11, 25);	//teste com data no padrão Pt-Br 25/11/1975	
		assertEquals(dtNascimento.format(fmt), p1.getDataDeNascimento().format(fmt));
	}
	@Test
	public void testePessoaIdade(){
		assertEquals(41, p1.getIdade());
		assertEquals(41, p2.getIdade());
		assertEquals(42, p3.getIdade());
		assertEquals(42, p4.getIdade());
		assertEquals(42, p5.getIdade());
		assertEquals(42, p6.getIdade());
		assertEquals(42, p7.getIdade());
		assertEquals(42, p8.getIdade());
		assertEquals(42, p9.getIdade());
		assertEquals(41, p10.getIdade());
		assertEquals(41, p11.getIdade());
		assertEquals(41, p12.getIdade());		
	}
	@Test
	public void testePessoaSigno(){

		assertEquals("Aquário", p3.getSigno(p3.getDataDeNascimento()));
		assertEquals("Peixes", p4.getSigno(p4.getDataDeNascimento()));
		assertEquals("Áries", p5.getSigno(p5.getDataDeNascimento()));
		assertEquals("Touro", p6.getSigno(p6.getDataDeNascimento()));
		assertEquals("Gêmeos", p7.getSigno(p7.getDataDeNascimento()));
		assertEquals("Câncer", p8.getSigno(p8.getDataDeNascimento()));
		assertEquals("Leão", p9.getSigno(p9.getDataDeNascimento()));
		assertEquals("Virgem", p10.getSigno(p10.getDataDeNascimento()));
		assertEquals("Libra", p11.getSigno(p11.getDataDeNascimento()));
		assertEquals("Escorpião", p12.getSigno(p12.getDataDeNascimento()));		
		assertEquals("Sagitário", p1.getSigno(p1.getDataDeNascimento()));
		assertEquals("Capricórnio", p2.getSigno(p2.getDataDeNascimento()));		
	}
}
