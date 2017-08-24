package com.leandroserra.tarefa;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class PessoaMain {

	public static void main(String[] args) {

		Pessoa p = new Pessoa(25, 11, 1975);
		System.out.println(p.getDataDeNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(p.getIdade());

		LocalDate dtNascimento = LocalDate.of(1975, 11, 25);
		LocalDate dtAgora = LocalDate.now();
		Period period = Period.between(dtNascimento, dtAgora);
		System.out.println("Diferença entre " + dtNascimento + " e " + dtAgora);
		System.out.println("Dias: " + period.getDays());
		System.out.println("Meses: " + period.getMonths());
		System.out.println("Anos: " + period.getYears());

		LocalDate dtNascimento2 = LocalDate.of(1975, 11, 25);

		System.out.println(dtNascimento2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalDate data = LocalDate.of(1975, 11, 25);
		System.out.println("Data FULL: "+ data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL) ) );
		System.out.println("Data LONG: "+ data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG) ) );
		System.out.println("Data MEDIUM: "+ data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM) ) );
		
		LocalDate d = LocalDate.of(1975, 11, 25);
		System.out.println("DIA: "+d.getDayOfMonth() );
		System.out.println("MÊS: "+d.getMonthValue() );
		System.out.println("ANO: "+d.getYear() );
		
		System.out.println(p.getSigno(LocalDate.of(1975, 11, 25)));
		System.out.println(p.getSigno(LocalDate.of(1975, 11, 13)));		
		
		System.out.println(p.getSigno(LocalDate.of(1975, 7, 25))); //leao
		System.out.println(p.getSigno(LocalDate.of(1975, 9, 13)));	//virgem
		System.out.println(p.getSigno(LocalDate.of(1975, 6, 25)));//cancer
		System.out.println(p.getSigno(LocalDate.of(1975, 8, 13)));	//leao	

	}

}
