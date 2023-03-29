package triangulo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestClass {
	
	Triangulo tri = new Triangulo();
	
	int ladoA = 16;
	int ladoB = 17;
	int ladoC = 25;
	
	@Test 
	public void verificaTipos() {
		String resultado = tri.verificaTipo(this.ladoA, this.ladoB, this.ladoC);
		assertEquals("Escaleno", resultado);
	}
	
	@Test
	public void testeEquilatero() {
		int ladoA = 25;
		int ladoB = 25;
		int ladoC = 25;
		String resultado = tri.verificaTipo(ladoA, ladoB, ladoC);
		assertEquals("Equilátero", resultado);		
	}
	
	@Test
	public void testeIsosceles() {
		int ladoA = 10;
		int ladoB = 20;
		int ladoC = 10;
		
		String resultado = tri.verificaTipo(ladoA, ladoB, ladoC);
		assertEquals("Isósceles", resultado);
	}
	
	@Test
	public void testeEscaleno() {
		int ladoA = 20;
		int ladoB = 25;
		int ladoC = 30;
		
		String resultado = tri.verificaTipo(ladoA, ladoB, ladoC);
		assertEquals("Escaleno", resultado);
	}
	
	@Test 
	public void testeLados() {
		int quantidadeLados = 4;
		boolean resultado = tri.verificaTriangulo(quantidadeLados);
		assertEquals(false, resultado);
	}
	
	@Test 
	public void testeLados2() {
		int quantidadeLados = 3;
		boolean resultado = tri.verificaTriangulo(quantidadeLados);
		assertEquals(true, resultado);
	}
	
	@Test 
	public void testeNegativo() {
		int ladoA = 19;
		int ladoB = -20;
		int ladoC = 40;
		
		String resultado = tri.verificaTipo(ladoA, ladoB, ladoC);
		assertEquals("Negativo", resultado);
	}
	
	@Test 
	public void testeNegativo2() {
		int ladoA = -19;
		int ladoB = 20;
		int ladoC = -40;
		
		String resultado = tri.verificaTipo(ladoA, ladoB, ladoC);
		assertEquals("Negativo", resultado);
	}
}
