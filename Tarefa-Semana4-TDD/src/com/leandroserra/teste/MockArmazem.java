package com.leandroserra.teste;
import java.util.Set;

import com.leandroserra.tarefa.ArmazemDePontos;
import com.leandroserra.tarefa.Ponto;
import com.leandroserra.tarefa.Usuario;

import static org.junit.Assert.assertEquals;

public class MockArmazem implements ArmazemDePontos  {
    private String usuArmazenado;
    private String tpPontuacaoArmazenada;
    private int qtdPontuacaoArmazenada;

    private String tipoDePonto;   
    private Set<Ponto> pontosDesteUsuario;  

    @Override
    public void armazenarPontosDoUsuario(String usuArmazenado, String tpPontuacaoArmazenada, int qtdPontuacaoArmazenada) {
        this.usuArmazenado = usuArmazenado;
        this.tpPontuacaoArmazenada = tpPontuacaoArmazenada;
        this.qtdPontuacaoArmazenada = qtdPontuacaoArmazenada;
    }

    @Override
    public int quantidadeDePontosPorTipoDoUsuario(String usu, String tpPontuacao) {
        return 0;
    }

    @Override
    public Set<Usuario> listaUsuariosPontuados() {
        return null;
    }

    @Override
    public Set<Ponto> tiposDepontosDeUmUsuario(String usu) {
        if (usu.equals(tipoDePonto)) {
            return pontosDesteUsuario;
        }

        return null;
    }

    public void armazenandoPontosDoUsuario(String usu, String tpDePonto, int qtdDePontos) {
        assertEquals(usu, usuArmazenado);
        assertEquals(tpDePonto, tpPontuacaoArmazenada);
        assertEquals(qtdDePontos, qtdPontuacaoArmazenada);
    }

    public MockArmazem usuarioComPontuacao(String usu) {
        this.tipoDePonto = usu;

        return this;
    }

    public void listar(Set<Ponto> pontos) {
        this.pontosDesteUsuario = pontos;
    }
}
