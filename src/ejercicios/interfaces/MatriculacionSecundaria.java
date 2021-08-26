package ejercicios.interfaces;

public class MatriculacionSecundaria implements InterfazMatricula{
	
	@Override
	public void solicitarInformaci�n() {
		// TODO Auto-generated method stub
		System.out.println("Nombre del Esudiante: Eduarda");
		System.out.println("Apellido del Esudiante: Nieto");
		System.out.println("Fecha de nacimiento: 15/02/2008");
		System.out.println("A�o que desea ingresar: Primero de bachillerato");
	}

	@Override
	public void validarPaseDeA�o() {
		// TODO Auto-generated method stub
		System.out.println("Pase de a�o validado");
		
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
		System.out.println("Matriculaci�n de Eduarda Completa");
	}
}
