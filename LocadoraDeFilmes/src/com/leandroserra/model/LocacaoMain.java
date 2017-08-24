package com.leandroserra.model;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;
import java.util.List;

import com.leandroserra.repository.Filmes;

public class LocacaoMain {

	public static void main(String[] args) {
		
		Filmes filmes = new Filmes();	
		List<Filme> filmesAlugados = Arrays.asList(filmes.porCodigo(0), filmes.porCodigo(2), filmes.porCodigo(3));
		Locacao locacao = new Locacao(filmesAlugados, new Cliente("Leandro"));
		
		locacao.imprimirRecibo();
		
		System.out.println("Testando a idade do cliente.");
		Cliente c = new Cliente("Leandro");
		c.setIdade(Period.between(LocalDate.of(1975, Month.NOVEMBER, 25), LocalDate.now()).getYears());
		System.out.printf("Cliente com %s anos", c.getIdade());
	}

}
