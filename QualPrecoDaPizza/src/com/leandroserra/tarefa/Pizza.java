package com.leandroserra.tarefa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza {
	

	private List<String> ingredientesDaPizza = new ArrayList<>();
	private static Map<String, Integer> totalDeCadaIngrediente = new HashMap<String, Integer>();
	private String especialidade;
	
	public static void zerarRegistrosDeIngredientes(){
		totalDeCadaIngrediente = new HashMap<String, Integer>();
	}
	
	public static Map<String, Integer> getLstIngredientes(){
		return totalDeCadaIngrediente;
	}
	
	public void adicionaIngrediente(String ingrediente){
		ingredientesDaPizza.add(ingrediente);
		contabilizaIngredientes(ingrediente);
	}

	private static void contabilizaIngredientes(String ingrediente){
		int valor = 0;
		
		if (totalDeCadaIngrediente.get(ingrediente)==null) {
			valor ++;
		}else{
			valor = totalDeCadaIngrediente.get(ingrediente);
			valor++;
		}
		totalDeCadaIngrediente.put(ingrediente, valor);	
	}
	public static int getQtdIngredientes() {
		return totalDeCadaIngrediente.size();
	}	
	
	public int getQtdIngredientes2() {
		return totalDeCadaIngrediente.size();
	}	
	
	public double getPreco() {	
		
		if (ingredientesDaPizza.size()>0 && ingredientesDaPizza.size()<=2){ 
			return 15.00;	
		}
		else if (ingredientesDaPizza.size()>2 && ingredientesDaPizza.size()<=5){
			return 20.00;			
		}else 
			return 23.00;			
		
	}	
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}
