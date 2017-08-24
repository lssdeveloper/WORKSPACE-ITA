package com.leandroserra.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import com.leandroserra.model.Filme;

public class Filmes {
	
	private static Filme[] filmes = {
			new Filme("O dia em que a Terra parou.", LocalDate.of(2000, Month.NOVEMBER, 25), new BigDecimal(6)),
			new Filme("Cavaleiro errante", LocalDate.of(2016, Month.MARCH, 10), new BigDecimal(3)),
			new Filme("O drácula do Brasil", LocalDate.of(2015, Month.NOVEMBER, 25), new BigDecimal(2)),
			new Filme("De volta para o futuro X", LocalDate.of(2014, Month.DECEMBER, 9), new BigDecimal(2)),
			new Filme("Qualquer diferente de Mary", LocalDate.of(2010, Month.MAY, 11), new BigDecimal(3)),
			new Filme("Goodzila go back a festa.", LocalDate.of(2002, Month.FEBRUARY, 2), new BigDecimal(4)),
			new Filme("Mentir é feio Pinóquio", LocalDate.of(2001, Month.AUGUST, 15), new BigDecimal(3)),
			new Filme("Branca de Neve e 9 anões", LocalDate.of(2013, Month.APRIL, 18), new BigDecimal(5)),
			new Filme("Lulalão e o PeTralha ladrão.", LocalDate.of(2013, Month.NOVEMBER, 13), new BigDecimal(2))
			
	};
	public List<Filme> lstFilmes(){
		return Arrays.asList(filmes);
	}
	@Override
	public String toString() {
		return super.toString();
	}
	public Filme porCodigo(int codigo) {
		
		return filmes[codigo];
	}
	
	
}
