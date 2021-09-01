package diagramas.de.flujo;

import java.util.Scanner;

public class MainD4Cajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("****BANCO PICHINCHA: Seleccione una opción****");
		System.out.println(" ");
		System.out.println("1. Retirar dinero");
		System.out.println("2. Cambiar clave");
		System.out.println("3. Bloquear cuenta");
		System.out.println("4. SALIR");
		
		Scanner teclado=new Scanner(System.in);
		int N= teclado.nextInt();
		
		while (N<4) {
			
			if (N==1) {
				System.out.println("ingresar valor a retirar");
				int VR=teclado.nextInt();
				System.out.println("Valor a retirar: "+VR);
			}else if (N==2){
				System.out.println("ingresar nueva clave");
				int C=teclado.nextInt();
				System.out.println("Su clave ha sido cambiada");
			}else{
				System.out.println("Su cuenta ha sido bloqueada");
			}
			
			System.out.println("****BANCO PICHINCHA: Seleccione una opción****");
			System.out.println(" ");
			System.out.println("1. Retirar dinero");
			System.out.println("2. Cambiar clave");
			System.out.println("3. Bloquear cuenta");
			System.out.println("4. SALIR");
			
			N= teclado.nextInt();	
		}
		
		System.out.println("****BANCO PICHINCHA: Muchas gracias****");
		
	}
}
