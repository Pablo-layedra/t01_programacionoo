package prueba.uno;

public class PasajeroVIP extends Pasajero{
	
	private String codigoMembresia;
	
	public PasajeroVIP(String nombre, String apellido, String codigoMembresia,int edad) {
		this.nombre=nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.codigoMembresia = codigoMembresia;
	}
	
	public String getCodigoMembresia() {
		return codigoMembresia;
	}

	public void setCodigoMembresia(String codigoMembresia) {
		this.codigoMembresia = codigoMembresia;
	}

	@Override
	public String toString() {
		return "PasajeroVIP [codigoMembresia=" + codigoMembresia + ", nombre=" + nombre + ", apellido=" + apellido
				+ "]";
	}

}
