package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class CriandoArquivoTxTMain {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o nome do arquivo:");
		String nomeArquivo = ler.nextLine();
		String palavra;

		File file = new File(Paths.get(Paths.get("").toAbsolutePath() + "/artefatos/" + nomeArquivo).toString());

		try {

			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			while (true) {
				System.out.printf("Informe uma palavra, FIM para encerrar gravação:\n");
				palavra = ler.nextLine();
				if (palavra.equalsIgnoreCase("FIM"))
					break;
				bw.write(palavra);
				bw.newLine();
			}


			bw.close();
			fw.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
