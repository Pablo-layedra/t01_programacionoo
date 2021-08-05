package Matrices;

import java.util.Scanner;

public class MainMatriz1 {

	public static void main(String[]arg) {
		
		//Declarar una matriz [3][4] tipo char y desarrolle un programa que vaya solicitando cada 
		//una de sus posiciones
		
		System.out.println("Ingrese longitud de la matriz:");
		Scanner teclado=new Scanner(System.in);
		char LongFila= teclado.next().charAt(0);
		char LongColumna= teclado.next().charAt(0);
		
		char A[][]= new char[3][4];
		for (int Fila=0; Fila<LongFila; Fila++){
			
			for (int Columna=0; Columna<LongColumna; Columna++){
				System.out.println("Ingrese valor de la posicion:["+Fila+"]["+Columna+"]");
				Scanner teclado2=new Scanner(System.in);
				char N= teclado2.next().charAt(0);
				A[Fila][Columna]=N;
			}
		}
		
		System.out.println("Imprimir la matriz");
		
        for (int Fila=0; Fila<LongFila; Fila++){
        	
        	for (int Columna=0; Columna<LongColumna; Columna++){
        		System.out.println(A[Fila][Columna]+" ");
        	}
        	
        	System.out.println();
        }
	}
}
