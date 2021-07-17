package Diagramas_de_flujo;

import java.util.Scanner;

public class MainE6 {
	
   public static void main(String[] args) {   
	   
	   //Buen trabajo co//
	   
		System.out.println("Ingrese número de filas:");
		Scanner teclado=new Scanner(System.in);
		int N= teclado.nextInt();
		
		for (int Fila = 1; Fila <= N; Fila = Fila + 1) {
			
			for (int ast=N; ast>=Fila; ast=ast-1) {
				System.out.print("*");
			}
			System.out.println();	
		}	
		}
   }