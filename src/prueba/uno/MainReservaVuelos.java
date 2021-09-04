package prueba.uno;

import java.util.Scanner;

public class MainReservaVuelos extends Pasajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tecladoString=new Scanner(System.in);
		Scanner tecladoInt=new Scanner(System.in);
		System.out.println("Ingrese informacion de pasajeros");
		System.out.println("Ingrese Nombre:");
		String nombre=tecladoString.nextLine();
		
		System.out.println("Ingrese Apellido:");
		String apellido=tecladoString.nextLine();
		
		System.out.println("Ingrese edad:");
		int edad=tecladoInt.nextInt();
		
		System.out.println("Que tipo de pasajero es: 1. Pasajero VIP; 2. Pasajero Economico");
		int opcion=tecladoInt.nextInt();
		
		String membresia="";
		String descuento="";
		if (opcion==1) {
			System.out.println("Ingresar codigo de membresia");
			membresia=tecladoString.nextLine();
		}else {
			System.out.println("Ingresar codigo de descuento");
			descuento=tecladoString.nextLine();
		}
		
		int N=tecladoInt.nextInt();
		
		PasajeroVIP pasajero1=new PasajeroVIP();
		pasajero1.setApellido(apellido);
		pasajero1.setNombre(nombre);
		pasajero1.setEdad(edad);
		pasajero1.setCodigoMembresia(membresia);
		
		PasajeroVIP pasajero2=new PasajeroVIP();
		pasajero2.setApellido(apellido);
		pasajero2.setNombre(nombre);
		pasajero2.setEdad(edad);
		pasajero2.setCodigoMembresia(membresia);
		
		PasajeroEconomico pasajeroE1=new PasajeroEconomico();
		pasajeroE1.setApellido(apellido);
		pasajeroE1.setNombre(nombre);
		pasajeroE1.setEdad(edad);
		pasajeroE1.setCodigoDescuento(descuento);
		
		PasajeroEconomico pasajeroE2=new PasajeroEconomico();
		pasajeroE2.setApellido(apellido);
		pasajeroE2.setNombre(nombre);
		pasajeroE2.setEdad(edad);
		pasajeroE2.setCodigoDescuento(descuento);
		
		
		Pasajero [][] asientos=new Pasajero[4][5];
		asientos[0][0]=pasajero1;
		asientos[0][1]=pasajero2;
		asientos[3][2]=pasajeroE1;
		asientos[3][3]=pasajeroE2;
		
		int opcionSalir=0;
		
		do {
			System.out.println("Ingresar datos del asiento: 0. Continuar, -1. Salir");
			opcionSalir=tecladoInt.nextInt();
			if (opcionSalir==0) {
				System.out.println("Ingresar fila de asiento");
				int fila=tecladoInt.nextInt();
				System.out.println("Ingresar columna de asiento");
				int columna=tecladoInt.nextInt();
				
				System.out.println("Datos del pasajero");
				System.out.println(asientos[fila][columna]);
			}else{
				
			}
		}while (opcionSalir!=-1);
	}
}
