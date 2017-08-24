package com.leandroserra.tarefa;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

	private LocalDate dataDeNascimento;

	public Pessoa(int dia, int mes, int ano) {

		this.dataDeNascimento = LocalDate.of(ano, mes, dia);

	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public long getIdade() {
		LocalDate dtNascimento = getDataDeNascimento();
		LocalDate dtAgora = LocalDate.now();
		return Period.between(dtNascimento, dtAgora).getYears();
	}

	public String getSigno(LocalDate dataDeNascimento) {

		int dia = dataDeNascimento.getDayOfMonth();
		int mes = dataDeNascimento.getMonthValue();

		String signo = null;

		switch (mes) {
		case 1:
			if ((dia >= 1) && (dia <= 20))
				signo = "Capricórnio";
			else
				signo = "Aquário";
			break;		
		case 2:
			if ((dia >= 1) && (dia <= 19))
				signo = "Aquário";
			else
				signo = "Peixes";
			break;		
		case 3:
			if ((dia >= 1) && (dia <= 20))
				signo = "Peixes";
			else
				signo = "Áries";
			break;		
		case 4:
			if ((dia >= 1) && (dia <= 20))
				signo = "Áries";
			else
				signo = "Touro";
			break;		
		case 5:
			if ((dia >= 1) && (dia <= 20))
				signo = "Touro";
			else
				signo = "Gêmeos";
			break;		
		case 6:
			if ((dia >= 1) && (dia <= 20))
				signo = "Gêmeos";
			else
				signo = "Câncer";
			break;		
		
		case 7:
			if ((dia >= 1) && (dia <= 21))
				signo = "Câncer";
			else
				signo = "Leão";
			break;		
		
		case 8:
			if ((dia >= 1) && (dia <= 22))
				signo = "Leão";
			else
				signo = "Virgem";
			break;
		case 9:
			if ((dia >= 1) && (dia <= 22))
				signo = "Virgem";
			else
				signo = "Libra";
			break;
		case 10:
			if ((dia >= 1) && (dia <= 22))
				signo = "Libra";
			else
				signo = "Escorpião";
			break;
		case 11:
			if ((dia >= 1) && (dia <= 21))
				signo = "Escorpião";
			else
				signo = "Sagitário";
			break;
		case 12:
			if ((dia >= 1) && (dia <= 21))
				signo = "Sagitário";
			else
				signo = "Capricórnio";
			break;			

		}

		return signo;

	}

}
