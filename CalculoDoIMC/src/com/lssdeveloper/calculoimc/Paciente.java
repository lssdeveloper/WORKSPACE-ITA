package com.lssdeveloper.calculoimc;

public class Paciente {
	//Resposnsabilidades Sabe
	private double peso;
	private double altura;
	private double imc;	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getImc() {
		return imc;
	}

	//Método construtor
	public Paciente(double peso, double altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}
	//Método construtor (Default)
	public Paciente(){
		
	}
	
	//Resposnsabilidades faz
	
	public void calcularIMC(){
		//calcula o índice da massa corporal
		this.imc = this.getPeso() / (this.getAltura() * this.getAltura()); 

	}
	public String diagnostico(){
		
		String msg = "o seu IMC é = " + String.format("%.2f", this.imc);
		
		if (this.imc < 16.00) {
			msg = msg +	" Baixo peso muito grave = IMC abaixo de 16 kg/m²";
		}else if((Math.round(this.imc) >= 16.00) && (this.imc <= 16.999)){
			msg = msg + " Baixo peso grave =  IMC entre 16 e 16,99 kg/m²";
		}else if((Math.round(this.imc) >= 17.00) && (this.imc <= 18.499)){
			msg = msg + " Baixo peso = IMC entre 17 e 18,49 kg/m²";
		}else if((Math.round(this.imc) >= 18.50) && (this.imc <= 24.999)) {
			msg = msg + " Peso normal = IMC entre 18,50 e 24,99 kg/m²";
		}else if((Math.round(this.imc) >= 25.00) && (this.imc <= 29.999)){
			msg = msg + " Sobrepeso = IMC entre 25 e 29,99 kg/m²";
		}else if((Math.round(this.imc) >= 30.00) && (this.imc <= 34.999)){
			msg = msg + " Obesidade grau I = IMC entre 30 e 34,99 kg/m²";
		}else if((Math.round(this.imc) >= 35.00) && (this.imc <= 39.999)){
			msg = msg + " Obesidade grau II = IMC entre 35 e 39,99 kg/m²";	
		}else if(Math.round(this.imc) >= 40.00){
			msg = msg + " Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²";
		}
		return msg;

	}

}
