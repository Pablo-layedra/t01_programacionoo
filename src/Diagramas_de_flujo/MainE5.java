package Diagramas_de_flujo;

import java.util.Scanner;

public class MainE5 {
	
	public static void main(String[] args) {
		
		System.out.println("Ingrese número de filas:");
		Scanner teclado=new Scanner(System.in);
		int N= teclado.nextInt();
		
		for (int Fila = 1; Fila <= N; Fila = Fila + 1) {
			
			for (int ast=1; ast<=Fila; ast=ast+1){
				System.out.print("*");
			}
			System.out.println();	
		}	
		}
}
