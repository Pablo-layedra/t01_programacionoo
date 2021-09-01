/**
 * 
 */
package diagramas.de.flujo;

/**
 * @author Pablo
 *

 */

import java.util.Scanner;
public class MainE1 {

	public static void main(String[]args) {
		System.out.println("Ingresar el valor del sueldo");
		Scanner teclado=new Scanner(System.in);
		int S= teclado.nextInt();
		
		if (S<300) {
			int B=40;
			System.out.println("Su bonificación es"+B);
		}else{
			int B=0;
			System.out.println("Su bonificación es"+B);
		}
	}
}
