import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		Cesta<Fruta> frutas = new Cesta<>();
		frutas.adiciona(new Fruta("Maça"));
		frutas.adiciona(new Fruta("Banana"));
		frutas.adiciona(new Fruta("Mamão"));
		frutas.adiciona(new Fruta("Goiaba"));
		frutas.adiciona(new FrutaVermelha("Morango"));
		frutas.adiciona(new Fruta("Laranja"));
		frutas.adiciona(new Fruta("Pêra"));
		frutas.adiciona(new Fruta("Uva"));
		
		List<FrutaVermelha> lstVermelhas = new ArrayList<>();
		lstVermelhas.add(new FrutaVermelha("Amora"));
		lstVermelhas.add(new FrutaVermelha("Cereja"));
		lstVermelhas.add(new FrutaVermelha("Framboesa"));
		//essa parte do védeo é o detalhe da aula (Hands-on: Tipos Genéricos na Prática.mp4)
		// no vídeo ele explica detalhadamente 
		//agora vamos tentar adicionar uma lista de frutas vermelhas como collection de fruta na minha cesta
		//frutas.adicionaTodos(lstVermelhas);  //no caso ele dá erro em tempo de compilação pq ele está esperando uma fruta
		//no caso ele aceitaria um Lis<Fruta>
		
		//mas se usar o coringa (Collection<? extends E> elementos) funciona
		
		frutas.adicionaTodos(lstVermelhas);
		while (frutas.temItens()) {
			System.out.println(frutas.retira());			
		}
		

	}

}
