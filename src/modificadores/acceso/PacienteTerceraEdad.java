package modificadores.acceso;

public class PacienteTerceraEdad extends Paciente {
	
	public void examenProstata() {
		System.out.println("Nombre: "+nombre+apellido);
		System.out.println("Diagnóstico: "+diagnostico);
		System.out.println("Cedula: "+cedula);
		//Debido a que es un atributo private, no aplica para subclases
		RealizarDiagnostico();
		
	}

}
