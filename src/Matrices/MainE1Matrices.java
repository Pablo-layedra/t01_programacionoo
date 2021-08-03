package Matrices;

import java.util.Scanner;

public class MainE1Matrices {

	public class MainE1Vectores  {
		
		public static void main(String[]arg) {
			
			//Declarar una matriz A tipo char con 5 filas y 4 columnas
			char A[][]= new char [5][4];
			
			//Declarar una matriz B tipo char con 5 filas y 6 columnas
			char B[][]= new char [5][6];
			
			//Declarar matriz miMatriz[2][4] tipo de dato long
			long miMatriz[][]= new long [2][4];
			
			//Declarar matriz miMatriz2[1][2] tipo de dato long
			
			// Asignar a la posicion miMatriz2[0][0] el valor de 2, a la posicion miMatriz2[1][1] el valor 8, a la posicion miMatriz2[2][2] el valor 2
			long miMatriz2[][]= new long [1][2];
			miMatriz2[0][0]='2';
			
			//Se señalara un error debido a que miMatriz2[1][1] no existe
			miMatriz2[1][1]='8';
			
			//Se señalara un error debido a que miMatriz2[2][2] no existe
			miMatriz2[2][2]='2';
			
			
		}
	}
}
