package com.leandroserra.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Devolucao {
	private LocalDateTime dataPrevista;
	private LocalDateTime dataReal;
	private BigDecimal valorDevolucao;
	
	
	public LocalDateTime getDataPrevista() {
		return dataPrevista;
	}
	public void setDataPrevista(LocalDateTime dataPrevista) {
		this.dataPrevista = dataPrevista;
	}
	public LocalDateTime getDataReal() {
		return dataReal;
	}
	public void setDataReal(LocalDateTime dataReal) {
		this.dataReal = dataReal;
	}
	public BigDecimal getValor() {
		return valorDevolucao;
	}
	public void setValorDevolucao(BigDecimal valorDevolucao) {
		this.valorDevolucao = valorDevolucao;
	}
	public Devolucao(LocalDateTime dataPrevista) {
		this.dataPrevista = dataPrevista;
	}
	
	
}
