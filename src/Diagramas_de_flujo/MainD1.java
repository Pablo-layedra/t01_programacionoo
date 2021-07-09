package Diagramas_de_flujo;

import java.util.Scanner;
public class MainD1 {

	public static void main(String[]arg) {
		System.out.println("Ingresar numero A:");
		Scanner teclado=new Scanner(System.in);
		int A= teclado.nextInt();
		
		System.out.println("Ingresar numero B:");
		Scanner teclado2=new Scanner(System.in);
		int B= teclado2.nextInt();
		
		if (B==0) {
			System.out.println("La división es imposible");
		}else{
			int D=(A/B);
			System.out.println("La division resultante es:"+D);
		}
	}
}