package capitulo_4_formulando_algoritmos;

import java.util.Scanner;

public class GradeBook {
	
	private String nomeDoCurso;
	private Scanner input = new Scanner(System.in);
	private double totaldasNotas = 0;
	private double mediaDasNotas = 0;
	private int nmDeAlunos = 0;
	
	public String getNomeDoCurso() {
		return nomeDoCurso;
	}
	public void setNomeDoCurso(String nomeDoCurso) {
		this.nomeDoCurso = nomeDoCurso;
	}
	public GradeBook(String nomeDoCurso){
		this.nomeDoCurso = nomeDoCurso;
	}
	public void ExibeBoasVindas(){
		System.out.printf("Bem-vindo ao GradeBook para o curso de \n%s!\n\n", getNomeDoCurso());
	}
	
	//determinar a média da classe com base em 10 notas inseridas
	private void mediaDaClasseSemSentinela(){
		
		System.out.println("Informe o número de alunos para calcular a média das notas:");
		this.nmDeAlunos = input.nextInt();
		int i = 1;
		while (i <= nmDeAlunos) {
			
			System.out.print("\nInforme uma nota:");
			totaldasNotas += input.nextInt(); 
			
			i++;
		}
		

		this.mediaDasNotas = totaldasNotas/nmDeAlunos;
		
		ExibeMediaFinalDaClasse(totaldasNotas, mediaDasNotas, nmDeAlunos);
		
	}
	private void mediaDeClasseComSentinela() throws GradeBookException{
		System.out.println("\nInforme uma nota de 0  a 10:");
		System.out.println("Para sair do Programa, digite (-1)");
		int nota = input.nextInt();
		while (nota != -1) {			
			this.totaldasNotas += nota; 
			this.nmDeAlunos += 1; 
			System.out.print("\nInforme uma nota de 0  a 10:");
			nota = input.nextInt();					
		}
		
		if (this.totaldasNotas > 0) 
			this.mediaDasNotas = totaldasNotas/nmDeAlunos;	
			
		ExibeMediaFinalDaClasse(totaldasNotas, mediaDasNotas, nmDeAlunos);

	}
	private void ExibeMediaFinalDaClasse(Double totaldasNotas, double mediaDasNotas, int nmDeAlunos) {
		
		if (this.totaldasNotas == 0) {
			System.out.println("A média não foi calculada.");			
		}else{
			System.out.print("\nO total de todas as " + nmDeAlunos + " notas:" + totaldasNotas);
			System.out.printf("\nA média da classe é %.2f\n ", mediaDasNotas);			
		}
	}
	public void perguntaComoCalcularAMedia(){
		System.out.print("\nComo quer calcular a média?");
		System.out.print("\n1-Com sentinela\n"
				+ "2-Sem sentinela\n");
		
		if (input.nextInt()==1) {
			try {
				mediaDeClasseComSentinela();
			} catch (GradeBookException e) {
			
			}
		}else
			mediaDaClasseSemSentinela();
	}
}
