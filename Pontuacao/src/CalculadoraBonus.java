
public class CalculadoraBonus {
	
	public int bonusDoDia = 1;
	
	public int calculaBonus(Usuario u){
		
		int multiplicador = bonusDoDia;
		
		if (u.vip) {
			multiplicador *= 5;
		}
		return multiplicador;
		
	}

}
