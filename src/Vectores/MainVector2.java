package Vectores;

import java.util.Scanner;

public class MainVector2 {
	
	public static void main(String[]arg) {
		
		//Declarar un vector x cuya longitud se solicite al usuario de tipo int y construya
		//un programa que ingrese los valores de cada posicion, finalmente, se imprimen los 
		//valores ingresados
		
		System.out.println("Ingresar longitud del vector:");
		Scanner teclado=new Scanner(System.in);
		int L= teclado.nextInt();
		
		int Vector[]= new int[L];
		
		for (int i=0; i<L; i++){
			System.out.println("Ingresar valor de la posicion:"+i);
			
			Scanner lector=new Scanner(System.in);
			int N= lector.nextInt();
			Vector[i]=N;
		}
		for (int i=0; i<L; i++){
			System.out.println("Valor de la posicion:"+i);
			System.out.println(Vector[i]);
		}
	}
}
