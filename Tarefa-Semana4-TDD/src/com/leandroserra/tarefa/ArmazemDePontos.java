package com.leandroserra.tarefa;
import java.util.Set;

public interface ArmazemDePontos {
    void armazenarPontosDoUsuario(String usuario, String tipoDePontos, int pontos);
    int quantidadeDePontosPorTipoDoUsuario(String usuario, String tipoDepontos);
    Set<Usuario> listaUsuariosPontuados();
    Set<Ponto> tiposDepontosDeUmUsuario(String usuario);
}
