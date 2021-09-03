package prueba.tres;

public class PasajeroAdulto extends Pasajeros{
	
	private String nombre;
	private String apellido;
	private int codigoSeguridadSocial;
	private String empresaTrabajo;
	

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
	

	public int getCodigoSeguridadSocial() {
		return codigoSeguridadSocial;
	}
	public void setCodigoSeguridadSocial(int codigoSeguridadSocial) {
		this.codigoSeguridadSocial = codigoSeguridadSocial;
	}
	
	public String getEmpresaTrabajo() {
		return empresaTrabajo;
	}
	public void setEmpresaTrabajo(String empresaTrabajo) {
		this.empresaTrabajo = empresaTrabajo;
	}
	

}
