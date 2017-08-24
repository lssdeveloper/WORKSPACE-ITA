
public class Principal {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		
		a1.bim1 = 70;
		a1.bim2 = 60;
		a1.bim3 = 80;
		a1.bim4 = 70;
		
		a1.nome = "Leandro";
		
		if(a1.passouDeAno()){
			System.out.println("Parabéns " + a1.nome + " você passou de ano!" );
		}
		
	}	
}


//Aluno leandro = new Aluno();
//leandro.nome = "Leandro";
//
//leandro.bim1 = 70;
//leandro.bim2 = 60;
//leandro.bim3 = 70;
//leandro.bim4 = 70;
//
//System.out.println(leandro.nome);
//
//
//if (VerificadoraDeNotas.passouDeAno(leandro)){			
//	System.out.println("Passou de ano! ");
//}else{
//	System.out.println("Desculpe não foi desta vez.");
//}
//
//
//Aluno guerra = new Aluno();
//guerra.nome = "Guerra";
//guerra.bim1 = 40;
//guerra.bim2 = 60;
//guerra.bim3 = 30;
//guerra.bim4 = 50;
//
//System.out.println(guerra.nome);
//
//if (VerificadoraDeNotas.passouDeAno(guerra)){
//	System.out.println("Passou de ano!");
//}else{
//	System.out.println("Desculpe não foi desta vez.");
//}
//

