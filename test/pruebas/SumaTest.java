package pruebas;

import nuevo.Suma;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SumaTest {
	 public Suma resultado;
	 public int esperado;
	 @Before
	 public void antesDelTest() {
		 this.resultado = new Suma(4, 7);
		 this.esperado = 11;
	 }
	
	 @After
	 	public void despuesDelTest() {
	 }
	
	 @Test
	 public void test1Suma() {
		 int resultado = this.resultado.sumar();
		 assertTrue(resultado == esperado);
	 }
} 
