import org.junit.Assert;
import org.junit.Test;

public class TesteConfiguracaoJUnit {

	@Test
	public void testeAdição() {
		Assert.assertEquals(2, (1+1), 0);;

	}
	@Test
	public void testeMultiplicação() {
		Assert.assertEquals(4, (2*2), 0);;

	}	

}
