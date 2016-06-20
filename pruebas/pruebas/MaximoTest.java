package pruebas;
import nuevo.Maximo;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

/**
*
* @author Fernando
*  Criterio de selección de caja de blanca: recorrer los caminos
*  Hay 5 caminos posibles:
*  1) x > y  & x > z 
*  2) x > y  & x <= z & z > y
*  3) x > y  & x <= z & z <= y
*  4) x <= y & z <= y
*  5) x <= y & z > y
*  
*  Probare el camino 2 con el vector de entrada: (4, 3, 11)
*/

public class MaximoTest {

	 public Maximo resultado;
	 public int esperado;
	 @Before
	 public void antesDelTest() {
		 this.resultado = new Maximo();
		 this.esperado = 11;
	 }
	
	 @After
	 public void despuesDelTest() {
	 
	 }
	
	 @Test
	 public void test1Suma() {
		 int resultado = this.resultado.GetMaximo(4, 3, 11);
		 assertTrue(resultado == esperado);
	 }

}
