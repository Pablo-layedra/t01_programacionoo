package deber.aerolínea;

import deber.modificadores.Pasajero;

public class Aerolínea {
	
    public String Aerolinea;
	public String datos_de_la_aerolinea;
	
	private void DatosPasajeros() {
		
		Pasajero David=new Pasajero();
		David.nombre="";
		David.apellido="";
		David.cedula="";
		//atributo protected
		David.destino="";
		David.numero_de_boleto="#55";
		David.puerta_de_entrada="";
		David.asiento="";
		David.clase="";
		David.PrecioBoleto="";
		//Atributo privado
		David.Equipaje="";
		//atributo privado
		
		RevisarEquipaje();
		//Accion privada
	}

}
