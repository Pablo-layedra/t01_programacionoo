package deber.ordenamiento;

public class Trabajador implements Comparable<Trabajador>{
	
	private String nombre;
	private String apellido;
	private int edad;
	private int sueldo;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	public int compareTo(Trabajador o) {
		// TODO Auto-generated method stub
		
		if (this.sueldo> o.getSueldo()) {
			return 1;
		}else if (this.sueldo==o.getSueldo()) {
			return 0;
		}else{
			return -1;
		}
	}
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", sueldo=" + sueldo
				+ "]";
	}
	
	

}
