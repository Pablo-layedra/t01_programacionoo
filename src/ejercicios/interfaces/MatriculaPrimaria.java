package ejercicios.interfaces;

public class MatriculaPrimaria implements InterfazMatricula{

	@Override
	public void solicitarInformaci�n() {
		// TODO Auto-generated method stub
		System.out.println("Nombre del Esudiante: Daniel");
		System.out.println("Apellido del Esudiante: Fernandez");
		System.out.println("Fecha de nacimiento: 15/02/2016");
		System.out.println("A�o que desea ingresar: Primero de b�sica");
	}

	@Override
	public void validarPaseDeA�o() {
		// TODO Auto-generated method stub
		System.out.println("No necesita validar");
		
	}

	@Override
	public void hacerExamenDiagnostico(String nota) {
		// TODO Auto-generated method stub
		System.out.println("Nota examen diagnostico: "+nota);
	}

	@Override
	public void validarPagoMatricula(int pago) {
		// TODO Auto-generated method stub
		System.out.println("Pago de matricula: "+pago);
		System.out.println("Pago realizado");
	}

	@Override
	public void validarMatriculacion() {
		// TODO Auto-generated method stub
		System.out.println("Matriculaci�n de Daniel Completa");
	}

}
