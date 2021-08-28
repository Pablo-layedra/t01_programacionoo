package ejercicios.ordenamiento.taller;

public class Estudiante implements Comparable<Estudiante> {
	
	private String nombre;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	private int numeroLista;
	public int getNumeroLista() {
		return numeroLista;
	}
	public void setNumeroLista(int numeroLista) {
		this.numeroLista = numeroLista;
	}
	
	
	
	private String apellido;
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	
	
	
	private int edad;
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	@Override
	public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub
		
		if (this.edad> o.getEdad()) {
			return 1;
		}else if (this.edad==o.getEdad()) {
			return 0;
		}else{
			return -1;
		}
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	//GET Y SET Alt Shift R S
}
	
