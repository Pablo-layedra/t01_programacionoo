package Diagramas_de_flujo;

import java.util.Scanner;

public class MainE1While {

	public static void main(String[]args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingresar n�mero:");
		int N=teclado.nextInt();
		int S=N;
		int C=0;
		float P=0f;
		while (N>0){
			System.out.println("Ingresar nuevo n�mero:");
			N=teclado.nextInt();
			S=S+N;
			C=C+1;
			P=(S/C);
		}
		System.out.println("Cantidad de n�meros ingresados:"+C);
		System.out.println("Suma de los n�meros ingresados:"+S);
		System.out.println("Promedio de los n�meros ingresados:"+P);
	}
}
