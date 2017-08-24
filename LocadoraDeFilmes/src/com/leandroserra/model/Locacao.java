package com.leandroserra.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Locacao {
	
	private List<Filme> filmes;
	private Cliente cliente;	
	private LocalDateTime data;
	
	private Devolucao devolucao;
	
	public List<Filme> getFilmes() {
		return filmes;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public LocalDateTime getData() {
		return data;
	}
	public Devolucao getDevolucao() {
		return devolucao;
	}
	
	public Locacao(List<Filme> filmes, Cliente cliente) {
		this.filmes = filmes;
		this.cliente = cliente;
		this.data = LocalDateTime.now();
		this.gerarDevolucao();
		
	}

	private void gerarDevolucao() {
		this.devolucao = new Devolucao(LocalDateTime.of(calcularDataprevista(), LocalTime.of(19, 0)));		
	}

	private LocalDate calcularDataprevista() {
		return this.data.plusDays(this.filmes.size()).toLocalDate();
	}

	public void imprimirRecibo() {
		System.out.printf("Obrigado %s.\n", this.cliente.getNome());
		System.out.println("Filme(s):");
		
		BigDecimal total = BigDecimal.ZERO;
		for (Filme filme : this.getFilmes()) {
			System.out.println(filme.getNome());
			total = total.add(filme.getValor());
		}
		System.out.printf("Valor total : R$%s", total);
		System.out.printf("\nData da devolução: %s", 
				this.getDevolucao().getDataPrevista().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"))
				);
	}


}
