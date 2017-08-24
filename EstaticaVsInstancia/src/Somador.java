
public class Somador {
	String nome;
	int vlrInstancia = 0;
	static int vlrEstatico= 0;
	
	void somar(){
		vlrInstancia++;
		vlrEstatico++;
	}
	void imprimir(){
		System.out.println("O somador " + nome +": instancia = "+ vlrInstancia + 
				" e estatico = "+ vlrEstatico);
		
		
	}
}
