package com.leandroserra.teste;
import org.junit.Before;
import org.junit.Test;

import com.leandroserra.tarefa.Placar;
import com.leandroserra.tarefa.Ponto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class TestePlacar {
	
	private MockArmazem mockArmazem;
	
	@Before
	public void init(){
		mockArmazem = new MockArmazem();
	}

	@Test
    public void armazenaUmUsuariosESuaPontuacao() {

        Placar placar = new Placar(mockArmazem);

        placar.armazenarPontos("Serra", "Estrela", 15);

        mockArmazem.armazenandoPontosDoUsuario("Serra", "Estrela", 15);
    }
    @Test
    public void listarPontuacaoPassandoTipoEUsuario() {
    	
        Placar placar = new Placar(mockArmazem);
        Set<Ponto> lstPontuacao = new HashSet<>(Arrays.asList(new Ponto("Estrela", 15)));
        mockArmazem.usuarioComPontuacao("Serra").listar(lstPontuacao);

        Set<Ponto> lista = placar.listarPontuacao("Serra");

        assertEquals(lstPontuacao, lista);
    }		
	@Test
    public void armazenaVariosUsuariosPontuados() {

        Placar placar = new Placar(mockArmazem);

        placar.armazenarPontos("Serra", "Estrela", 15);
        mockArmazem.armazenandoPontosDoUsuario("Serra", "Estrela", 15);        
        placar.armazenarPontos("Serra", "Prata", 5);
        mockArmazem.armazenandoPontosDoUsuario("Serra", "Prata", 5);        
        placar.armazenarPontos("Serra", "Moeda", 1);
        mockArmazem.armazenandoPontosDoUsuario("Serra", "Moeda", 1);        
        placar.armazenarPontos("Amanda", "Estrela", 15);
        mockArmazem.armazenandoPontosDoUsuario("Amanda", "Estrela", 15);        
        placar.armazenarPontos("Leana", "Moeda", 1);   
        mockArmazem.armazenandoPontosDoUsuario("Leana", "Moeda", 1);       
    }
}
