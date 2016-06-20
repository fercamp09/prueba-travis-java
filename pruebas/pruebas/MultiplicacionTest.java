package pruebas;
import nuevo.Multiplicacion;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class MultiplicacionTest {
	 @Test
	 public void test1Multiplicar() {
		 Multiplicacion multiplicacion = new Multiplicacion(2, 3);
		 int resultado = multiplicacion.multiplicar();
		 int esperado = 6;
		 assertTrue(resultado == esperado);
	 }
	 @Test
	 public void test2Multiplicar() {
		 Multiplicacion multiplicacion = new Multiplicacion(5, 7);
		 int resultado = multiplicacion.multiplicar();
		 int esperado = 35;
		 assertTrue(resultado == esperado);
	 }
}