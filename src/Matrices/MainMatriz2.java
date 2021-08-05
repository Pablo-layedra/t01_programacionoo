package Matrices;

import java.util.Scanner;

public class MainMatriz2 {

	public static void main(String[] arg) {

		System.out.println("Impresión de figura 1:");

		char A[][] = new char[5][5];
		for (int Fila = 0; Fila < 5; Fila++) {
			for (int Columna = 0; Columna < 5; Columna++) {
				if (Fila==Columna){
					A[Fila][Columna]=1;
				}else{
					A[Fila][Columna]=0;
				}
			}
		}
		
        System.out.println("Imprimir la matriz");
		
        for (int Fila=0; Fila<5; Fila++){
        	
        	for (int Columna=0; Columna<5; Columna++){
        		System.out.println(A[Fila][Columna]+" ");
        	}
        	System.out.println();
        }
	}
}
