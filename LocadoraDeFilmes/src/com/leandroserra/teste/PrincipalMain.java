package com.leandroserra.teste;

import java.time.format.DateTimeFormatter;

import com.leandroserra.repository.Filmes;

public class PrincipalMain {

	public static void main(String[] args) {
		
		System.out.printf("%-30s %s\n", "Nome:", "Data de Lançamento:");
		
		Filmes filmes = new Filmes();
		
		filmes.lstFilmes().forEach(f -> {		
			System.out.printf("%-30s %s\n", f.getNome(), 
					f.getDataLancamento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		});		

	}

}
