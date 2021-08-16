package deber.modificadores;

public class Impresora extends Pasajero{
	
	void imprimirBoleto() {
		
		System.out.println("Nombre: "+nombre+apellido);
		System.out.println("Destino: "+destino);
		System.out.println("Nombre: "+nombre+apellido);
		System.out.println("Entrada: "+puerta_de_entrada);
		System.out.println("Asiento: "+asiento);
		System.out.println("Clase: "+clase);
		System.out.println("Num boleto: "+numero_de_boleto);
		
		
	}
}
