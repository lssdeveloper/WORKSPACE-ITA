import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Cesta<E> {
	
	private List<E> lista = new ArrayList<>();
	
	public void adiciona(E elemento){
		lista.add(elemento);
	}
	public E retira(){
		Random r = new Random(System.currentTimeMillis());
		return lista.remove(r.nextInt(lista.size()));
		 		
	}
	public boolean temItens(){
		return !lista.isEmpty();
	}
	
	//No caso tem que se usar o coringa (Collection<? extends E> elementos)
	//public void adicionaTodos(Collection<E> elementos){
	
	public void adicionaTodos(Collection<? extends E> elementos){
		for (E e : elementos) {
			adiciona(e);
		}
	}

}
