package com.leandroserra.tarefa;
import java.io.Serializable;

public class Ponto implements Serializable {
	private static final long serialVersionUID = 1L;
	private String tipoDePontos;
    private int qtdDepontos;

    public Ponto(String tipoDepontos) {
        this.tipoDePontos = tipoDepontos;
        this.qtdDepontos = 0;
    }

    public Ponto(String tipoDepontos, int qtdDepontos) {
        this.tipoDePontos = tipoDepontos;
        this.qtdDepontos = qtdDepontos;
    }

    public int getQtdDePontos() {
        return this.qtdDepontos;
    }

    public String getTipoDePontos() {
        return this.tipoDePontos;
    }

    public void addPontos(int qtdDepontos) {
        this.qtdDepontos += qtdDepontos;
    }
}
