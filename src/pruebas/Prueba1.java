package pruebas;

import java.util.Scanner;

public class Prueba1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int S=0;
		int C=0;
		float P=0f;
		for (int I = 1; I>0; I = I ++) {
			System.out.println("Ingresar número:");
			int N= teclado.nextInt();
			if (N==0){
				I=-1;
			}else{
				S=S+N;
				C=C+1;
				P=(S/C);
			}
		}
		System.out.println("Cantidad de números ingresados:"+C);
		System.out.println("Suma de los números ingresados:"+S);
		System.out.println("Promedio de los números ingresados:"+P);
	}
}
