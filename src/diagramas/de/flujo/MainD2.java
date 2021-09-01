package diagramas.de.flujo;

import java.util.Scanner;
public class MainD2 {

	public static void main(String[]arg) {
		System.out.println("Ingresar numero A:");
		Scanner teclado=new Scanner(System.in);
		int A= teclado.nextInt();
		
		System.out.println("Ingresar numero B:");
		Scanner teclado2=new Scanner(System.in);
		int B= teclado2.nextInt();
		
		if (A>B) {
			int D=(A%B);
			if (D==0) {
				System.out.println("El número A es multiplo del numero B");
			}else{
				System.out.println("El número A no es multiplo del numero B");
			}
			
		}else{
			int D=(B%A);
			if (D==0) {
				System.out.println("El número B es multiplo del numero A");
			}else{
				System.out.println("El número B no es multiplo del numero A");
			}
		}
	}
}
		
				
	