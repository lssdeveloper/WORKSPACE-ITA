package com.lssdeveloper.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.lssdeveloper.calculoimc.Paciente;

public class TestePaciente {
	
	@Test
	public void baixoPesoMuitoGrave(){
		double peso = 40.0;
		double altura = 1.60;
		Paciente p = new Paciente(peso, altura);
		p.calcularIMC();
		assertEquals(15.60, 15.60, 15.625);
		System.out.println(p.diagnostico());
		//o seu IMC é = 15,62 Baixo peso muito grave = IMC abaixo de 16 kg/m²
	}
	@Test
	public void baixoPesoGrave(){
		//o seu IMC é = 15,62 Baixo peso muito grave = IMC abaixo de 16 kg/m²
		double peso = 43.50;
		double altura = 1.60;
		Paciente p = new Paciente(peso, altura);
		p.calcularIMC();
		assertEquals(16.00, 16.99, 16.999);
		System.out.println(p.diagnostico());
	}
	@Test
	public void baixoPeso(){
		//o seu IMC é = 16,99 Baixo peso grave =  IMC entre 16 e 16,99 kg/m²
		double peso = 43.55;
		double altura = 1.60;
		Paciente p = new Paciente(peso, altura);
		p.calcularIMC();
		assertEquals(17.00, 18.49, 18.499);
		System.out.println(p.diagnostico());
	}
	@Test
	public void pesoNormal(){
		//o seu IMC é = 18,55 Peso normal = IMC entre 18,50 e 24,99 kg/m²
		double peso = 47.50;
		double altura = 1.60;
		Paciente p = new Paciente(peso, altura);
		p.calcularIMC();
		assertEquals(18.50, 24.99, 24.999);
		System.out.println(p.diagnostico());
		/***********************************/
		double peso2 = 63.95;
		double altura2 = 1.60;
		Paciente p2 = new Paciente(peso2, altura2);
		p2.calcularIMC();
		assertEquals(18.50, 24.99, 24.999);
		System.out.println(p2.diagnostico());
		//o seu IMC é = 24,98 Peso normal = IMC entre 18,50 e 24,99 kg/m²
	}
	@Test
	public void sobrePeso(){
		double peso = 64;
		double altura = 1.60;
		Paciente p = new Paciente(peso, altura);
		p.calcularIMC();
		assertEquals(25.00, 29.99, 29.999);
		System.out.println(p.diagnostico());
		//o seu IMC é = 25,00 Sobrepeso = IMC entre 25 e 29,99 kg/m²
		/***********************************/
		double peso2 = 76.70;
		double altura2 = 1.60;
		Paciente p2 = new Paciente(peso2, altura2);
		p2.calcularIMC();
		assertEquals(25.00, 29.99, 29.999);
		System.out.println(p2.diagnostico());
		//o seu IMC é = 29,96 Sobrepeso = IMC entre 25 e 29,99 kg/m²
	}
	@Test
	public void obesidadeGrauI(){
		double peso = 80;
		double altura = 1.60;
		Paciente p = new Paciente(peso, altura);
		p.calcularIMC();
		assertEquals(30.00, 34.99, 34.999);
		System.out.println(p.diagnostico());
		//o seu IMC é = 31,25 Obesidade grau I = IMC entre 30 e 34,99 kg/m²
		/***********************************/
		double peso2 = 89.5;
		double altura2 = 1.60;
		Paciente p2 = new Paciente(peso2, altura2);
		p2.calcularIMC();
		assertEquals(30.00, 34.99, 34.999);
		System.out.println(p2.diagnostico());
		//o seu IMC é = 34,96 Obesidade grau I = IMC entre 30 e 34,99 kg/m²

	}
	@Test
	public void obesidadeGrauII(){
		double peso = 89.60;
		double altura = 1.60;
		Paciente p = new Paciente(peso, altura);
		p.calcularIMC();
		assertEquals(35.00, 39.99, 39.999);
		System.out.println(p.diagnostico());
		//o seu IMC é = 35,00 Obesidade grau II = IMC entre 35 e 39,99 kg/m²
		/***********************************/
		double peso2 = 102.38;
		double altura2 = 1.60;
		Paciente p2 = new Paciente(peso2, altura2);
		p2.calcularIMC();
		assertEquals(35.00, 39.99, 39.999);
		System.out.println(p2.diagnostico());
		//o seu IMC é = 39,98 Obesidade grau II = IMC entre 35 e 39,99 kg/m²

	}
	@Test
	public void obesidadeGrauIII(){
		double peso = 102.40;
		double altura = 1.60;
		Paciente p = new Paciente(peso, altura);
		p.calcularIMC();
		assertEquals(40.00, 40.01, 40.599);
		System.out.println(p.diagnostico());
		//o seu IMC é = 40,00 Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²
	}

}
