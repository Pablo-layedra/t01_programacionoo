package Diagramas_de_flujo;

import java.util.Scanner;

public class MainE4 {

	// Imprimir en pantalla la tabla de multiplicar del 7 hasta el 12

	public static void main(String[] args) {
		System.out.println("Imprimir labla de multiplicar del 7 hasta el 12:");
		for (int M=0; M<=12; M = M+1) {
			int Mul=(M*7);
			System.out.println("7*"+M+"="+Mul);
		}
		System.out.println("Tabla del 7 impresa");
	}
}