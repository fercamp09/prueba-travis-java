package nuevo;

public class Maximo
{
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
	 */
	
    public int GetMaximo(int x,int y, int z){
        int max;
        // Sentencia 2
        if (x>y && x>z)
                        max = x;
        // Sentencia 
        else
                        if (z>y)
                                max = z;
                        else
                                max = y;
        System.out.println ("El maximo es " + max);
        return max;
        }
    }

