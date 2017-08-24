
import org.junit.Assert;
import org.junit.Test;

public class TesteRegistroDePontos {

	@Test
	public void pontosCriarTopicos() {
		Usuario u = new Usuario();
		u.nome = "Leandro";
		CalculadoraBonus cb1 = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb1);
		rp.criarUmTopico(u);
		Assert.assertEquals(u.pontos, 5);
		
	}
	
	@Test
	public void pontosCriarTopicosVip() {
		Usuario u = new Usuario();
		u.nome = "Leandro";
		u.vip = true;
		CalculadoraBonus cb2 = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb2);
		rp.criarUmTopico(u);
		Assert.assertEquals(u.pontos, 25);
		
	}
	@Test
	public void pontosCriarTopicosBonusDia() {
		Usuario u = new Usuario();
		u.nome = "Leandro";
		
		CalculadoraBonus cb3 = new CalculadoraBonus();
		cb3.bonusDoDia = 3;
		RegistroPontos rp = new RegistroPontos(cb3);
		rp.criarUmTopico(u);
		Assert.assertEquals(u.pontos, 15);
		
	}
	
	@Test
	public void pontosCriarTopicosVipBonusDoDia() {
		Usuario u = new Usuario();
		u.nome = "Leandro";
		u.vip = true;
		CalculadoraBonus cb4 = new CalculadoraBonus();
		cb4.bonusDoDia = 2;
		RegistroPontos rp = new RegistroPontos(cb4);
		rp.criarUmTopico(u);
		Assert.assertEquals(u.pontos, 50);
		
	}

}
