import static org.junit.Assert.*;

import org.junit.Test;


public class ContasConfiaveisTest {
	Contas conta = new Contas();
	@Test
	public void testQuadrado() {
		assertEquals(0, conta.calculaQuadrado(0),0.001);
	}
	@Test
	public void testQuadradoDecimal(){
		assertEquals(0.0001,conta.calculaQuadrado(0.01),0.00001);
	}
	
	@Test
	public void testQuadradoDecimalNegativo(){
		assertEquals(0.0001,conta.calculaQuadrado(-0.01),0.00001);
	}
	
	@Test
	public void testQuadradoGrande(){
		assertEquals(10000.0,conta.calculaQuadrado(100),0.1);
	}
	
	@Test
	public void testQuadradoGrandeNegativo(){
		assertEquals(10000,conta.calculaQuadrado(-100),0.1);
	}
	public void testCubo() {
		assertEquals(0, conta.calculaCubo(0),0.001);
	}
	@Test
	public void testCuboDecimal(){
		assertEquals(0.001,conta.calculaCubo(0.1),0.00001);
	}
	
	@Test
	public void testCuboDecimalNegativo(){
		assertEquals(-0.001,conta.calculaCubo(-0.1),0.00001);
	}
	
	@Test
	public void testCuboGrande(){
		assertEquals(1000.0,conta.calculaCubo(10),0.1);
	}
	
	@Test
	public void testCuboGrandeNegativo(){
		assertEquals(-1000,conta.calculaCubo(-10),0.1);
	}


}
