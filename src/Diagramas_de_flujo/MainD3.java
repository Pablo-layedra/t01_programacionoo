package Diagramas_de_flujo;

import java.util.Scanner;
public class MainD3 {

	public static void main(String[]arg) {
		System.out.println("Ingresar el valor del sueldo");
		Scanner teclado=new Scanner(System.in);
		int S= teclado.nextInt();
		
		if (S<300) {
			int B=100;
			System.out.println("Su bonificación es"+B);
			int ST=(S+100);
			System.out.println("El sueldo total es:"+ST);
		}else{
			if (S>400) {
			   int B=50;
			   System.out.println("Su bonificación es"+B);
			   int ST=(S+50);
			   System.out.println("El sueldo total es:"+ST);
			}else{
				int B=70;
				System.out.println("Su bonificación es"+B);
				int ST=(S+70);
				System.out.println("El sueldo total es:"+ST);
			}
		}
	}
}