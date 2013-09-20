import static org.junit.Assert.*;

import org.junit.Test;


public class ContasNaoConfiaveisTest {

	Contas conta = new Contas();
	ContasNaoConfiaveis conta1 = new ContasNaoConfiaveis();
	
	@Test
	public void testQuadrado() {
		assertEquals( conta.calculaQuadrado(0),conta1.calculaQuadrado(0),0.001);
	}
	@Test
	public void testQuadradoDecimal(){
		assertEquals(conta.calculaQuadrado(0.01),conta1.calculaQuadrado(0.01),0.00001);
	}
	
	@Test
	public void testQuadradoDecimalNegativo(){
		assertEquals(conta.calculaQuadrado(-0.01),conta1.calculaQuadrado(-0.01),0.00001);
	}
	
	@Test
	public void testQuadradoGrande(){
		assertEquals(conta.calculaQuadrado(100),conta1.calculaQuadrado(100),0.1);
	}
	
	@Test
	public void testQuadradoGrandeNegativo(){
		assertEquals(conta.calculaQuadrado(-100),conta1.calculaQuadrado(-100),0.1);
	}
	public void testCubo() {
		assertEquals(conta.calculaCubo(0),conta1.calculaCubo(0),0.001);
	}
	@Test
	public void testCuboDecimal(){
		assertEquals(conta.calculaCubo(0.1),conta1.calculaCubo(0.1),0.00001);
	}
	
	@Test
	public void testCuboDecimalNegativo(){
		assertEquals(conta.calculaCubo(-0.1),conta1.calculaCubo(-0.1),0.00001);
	}
	
	@Test
	public void testCuboGrande(){
		assertEquals(conta.calculaCubo(10),conta1.calculaCubo(10),0.1);
	}
	
	@Test
	public void testCuboGrandeNegativo(){
		assertEquals(conta.calculaCubo(-10),conta1.calculaCubo(-10),0.1);
	}

}
