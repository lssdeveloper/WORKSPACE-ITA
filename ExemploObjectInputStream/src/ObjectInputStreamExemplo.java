import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamExemplo {

	public static void main(String[] args) {
	
		String str = "Leandro é o cara, o melhor developer Java!";
		byte[] b = {'e', 'x', 'e', 'm', 'p', 'l', 'o'};
		String file = "teste.txt";
		try {
			//cria um novo arquivo com um ObjectInputStream
			FileOutputStream foutstream = new FileOutputStream(file);
			ObjectOutputStream ous = new ObjectOutputStream(foutstream);
			
			//escreve no arquivo
			ous.writeObject(str);
			ous.writeObject(b);
			// crie um ObjectInputStream para o arquivo que criamos antes
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			// lê e imprime um objeto e lance-o como string
			System.out.println("" + (String) ois.readObject());
			// lê e imprime um objeto e lance-o como string
			byte[] leitor = (byte[]) ois.readObject();
			String str2 = new String(leitor);			
			System.out.println("" + str2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}

}
