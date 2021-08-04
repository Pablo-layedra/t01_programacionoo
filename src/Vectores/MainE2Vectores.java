package Vectores;

import java.util.Scanner;

public class MainE2Vectores {
	
	public static void main(String[]arg) {
		
		char Vector[]= new char[3];
		
		for (char i=0; i<3; i++){
			System.out.println("Ingresar valor de la posicion:"+i);
			
			Scanner lector=new Scanner(System.in);
			char N= lector.next().charAt(0);
			Vector[i]=N;
		}
		//recorriendo el vector lleno
		for (int i=0; i<3; i++){
			System.out.println("Valor de la posicion:"+i);
			System.out.println(Vector[i]);
		}
	}
}
