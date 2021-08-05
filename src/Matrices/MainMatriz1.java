package Matrices;

import java.util.Scanner;

public class MainMatriz1 {

	public static void main(String[]arg) {
		
		//Declarar una matriz [3][4] tipo char y desarrolle un programa que vaya solicitando cada 
		//una de sus posiciones
		
		char A[][]= new char[3][4];
		for (int Fila=0; Fila<3; Fila++){
			
			for (int Columna=0; Columna<4; Columna++){
				System.out.println("Ingrese valor de:["+Fila+"]["+Columna+"]");
				Scanner teclado=new Scanner(System.in);
				char N= teclado.next().charAt(0);
				A[Fila][Columna]=N;
			}
		}
		
        for (int Fila=0; Fila<3; Fila++){
        	
        	for (int Columna=0; Columna<4; Columna++){
        		System.out.println("El valor de:["+Fila+"]["+Columna+"] es: "+A[Fila][Columna]);
        	}
        }
	}
}
