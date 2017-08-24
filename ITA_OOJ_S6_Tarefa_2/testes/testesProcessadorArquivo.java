import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class testesProcessadorArquivo {

	@Rule
	public ExpectedException expectedEx = ExpectedException.none();
	
	@Test
	public void testAbrirCorreto() {
		Map<String,String> map = ProcessadorArquivo.processar("arquivo_correto");
		assertEquals("Eduardo", map.get("nome"));
		assertEquals("Guerra", map.get("sobrenome"));
		assertEquals("35", map.get("idade"));
	}
	
	@Test
	public void testAbrirVazio() throws Exception{
		expectedEx.expect(LeituraArquivoException.class);
		expectedEx.expectMessage("Arquivo vazio");
		ProcessadorArquivo.processar("arquivo_vazio");
	}
	
	@Test
	public void testAbrirFormatoDeArquivoInvalido() throws Exception{
		expectedEx.expect(LeituraArquivoException.class);
		expectedEx.expectMessage("Formato de arquivo inválido");
		ProcessadorArquivo.processar("arquivo_errado");
	}
	
	@Test
	public void testAbrirArquivoInexistente() throws Exception{
		expectedEx.expect(LeituraArquivoException.class);
		expectedEx.expectMessage("Erro ao abrir o arquivoC:\\Users\\Bernardo\\workspace\\ITA_OOJ\\ITA_OOJ_S6_Tarefa_2\\artefatos\\arquivo_");
		ProcessadorArquivo.processar("arquivo_");
		
		
	}

}
