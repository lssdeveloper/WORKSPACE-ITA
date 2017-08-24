import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcessadorArquivo {
	public static Map<String, String> processar(String nomeArquivo){
		Map<String, String> map = new HashMap<>();
		
		try {
			List<String> lista = Files.readAllLines(Paths.get(Paths.get("").toAbsolutePath()+"/artefatos/"+nomeArquivo),
					Charset.availableCharsets().get(Charset.availableCharsets().firstKey()));
			
			if(lista.isEmpty()) throw new LeituraArquivoException("Arquivo vazio");
			for(String linha : lista){
				if(linha.contains("->") && linha.indexOf("->") == linha.lastIndexOf("->")){
					String[] linhaCortada =  linha.split("->");
					map.put(linhaCortada[0], linhaCortada[1]);
				}else{
					throw new LeituraArquivoException("Formato de arquivo inválido");
				}
			}
		} catch (IOException e) {
			throw new LeituraArquivoException("Erro ao abrir o arquivo"+e.getMessage());
		}	
		
		
		return map;
		
	}
}
