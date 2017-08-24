
public class Aluno {
	
	public String nome;
	
	public int bim1;
	public int bim2;
	public int bim3;
	public int bim4;
	
	public int media(){
		
		int total = 0;
		total += this.bim1;
		total += this.bim2;
		total += this.bim3;
		total += this.bim4;
		
		return total/4;
		
	}
	
	public boolean passouDeAno(){
				
		if (media() >=60) {
			return true;
		}
		return false;
		
	}

}
