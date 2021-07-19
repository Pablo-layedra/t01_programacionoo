/**
 * 
 */
package Diagramas_de_flujo;

/**
 * @author Pablo
 *

 */

import java.util.Scanner;
public class MainE2 {
	
	public static void main(String[]args) {
		System.out.println("Ingresar un numero:");
		Scanner teclado=new Scanner(System.in);
		int N= teclado.nextInt();
		
		for(int C=N+1; C<=N+5; C++) {
			System.out.println("El siguiente numero es:"+C);
		}
	}
}