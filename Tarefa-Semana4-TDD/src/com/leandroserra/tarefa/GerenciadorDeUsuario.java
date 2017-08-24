package com.leandroserra.tarefa;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeUsuario {
    private String arquivo;

    public GerenciadorDeUsuario(String arquivo) {
        this.arquivo = arquivo;
        seArquivoVazioInicia(arquivo);
    }

    public void esvaziarGerenciador() {
        guardarLista(new HashMap<>());
    }
    public Map<String, Usuario> listarUsuario() {
        try {
            ObjectInputStream objectInputStream = getOIS();
            Object object = objectInputStream.readObject();
            objectInputStream.close();

            return (Map<String, Usuario>) object;
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void guardar(Usuario usu) {
        Map<String, Usuario> usuarios = listarUsuario();
        usuarios.put(usu.getUsuario(), usu);

        guardarLista(usuarios);
    }

    public Usuario retornaUmNovoUsuario(String nomeUsuario) {
		return retornaUsuario(nomeUsuario);
	}

	public Usuario retornaUsuario(String usu) {
        Map<String, Usuario> usuarios = listarUsuario();
        Usuario usuario = usuarios.getOrDefault(usu, new Usuario(usu));

        return usuario;
    }

    private void seArquivoVazioInicia(String arquivo) {
        File file = new File(arquivo);
        if (file.length() == 0) {
            esvaziarGerenciador();
        }
    }

    private ObjectInputStream getOIS() throws IOException {
    	return new ObjectInputStream(new FileInputStream(this.arquivo));
    }

    private ObjectOutputStream getOOS() throws IOException {
    	return new ObjectOutputStream(new FileOutputStream(this.arquivo));
    }

    private void guardarLista(Map<String, Usuario> lstUsuarios) {
        try {
            ObjectOutputStream oout = getOOS();
            oout.writeObject(lstUsuarios);
            oout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
