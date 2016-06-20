package nuevo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Fernando
 * 
 */
public class Programa {
    
	
	
    public static void main (String args[]) throws IOException
    {
    	// Sentencia 1
	    BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
	
	    int x,y,z;
	
	    System.out.println("Introduce x,y,z: ");
	    x =  Integer.parseInt (entrada.readLine()); 
	    y =  Integer.parseInt (entrada.readLine());
	    z =  Integer.parseInt (entrada.readLine());
	    Maximo M= new Maximo();
	    // Fin de sentencia 1
	    M.GetMaximo(x,y,z);
    }
    
}