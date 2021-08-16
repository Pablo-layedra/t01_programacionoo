package modificadores.acceso;

public class Paciente {
	
	public String nombre;
	public String apellido;
	
	private String cedula;
	private String medicacion;
	
	public void obtenerTurno() {
		System.out.println("Nombre: "+nombre+apellido);
	}
	
	private void obtenerClaveCajero() {
		
	}
	
	protected String diagnostico;
	
	protected void RealizarDiagnostico() {
		
	}

}
