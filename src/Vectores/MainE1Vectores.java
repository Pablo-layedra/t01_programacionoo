package Vectores;

import java.util.Scanner;

public class MainE1Vectores {
	public static void main(String[]arg) {
		
		//Declarar vector [10] tipo int 
		int miVector[]= new int[10];
		
		//Declarar vector [5] tipo char
		char miVector2[]= new char[5];
		
		//Declarar vector [4] tipo char, asignar letra A en posiciones 0 y 2
		char miVec[]= new char[4];
		miVec[0]='A';
		miVec[2]='A';
		
		//Declarar vector [3] tipo byte, asignar número 0 a la posición 0,1,2 y 3
		byte miVector3[]= new byte[3];
		miVector3[0]='0';
		miVector3[1]='0';
		miVector3[2]='0';
		//Se señalara un error debido a que miVector3[3] no existe
		miVector3[3]='0';
		
		//Declarar vector[3] tipo char, asignar letra A a las posiciones 0,1 y letra B a las posicion 2
		char miVector4[]= new char[3];
		miVector4[0]='A';
		miVector4[1]='A';
		miVector4[2]='B';
		//imprimir posiciones 0 y 2
		System.out.println("Posición1:"+miVector4[0]);
		System.out.println("Posición2:"+miVector4[2]);
		
		
	}
}
