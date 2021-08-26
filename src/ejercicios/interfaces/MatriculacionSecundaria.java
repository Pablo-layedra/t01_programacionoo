package ejercicios.interfaces;

public class MatriculacionSecundaria implements InterfazMatricula{
	
	@Override
	public void solicitarInformación() {
		// TODO Auto-generated method stub
		System.out.println("Nombre del Esudiante: Eduarda");
		System.out.println("Apellido del Esudiante: Nieto");
		System.out.println("Fecha de nacimiento: 15/02/2008");
		System.out.println("Año que desea ingresar: Primero de bachillerato");
	}

	@Override
	public void validarPaseDeAño() {
		// TODO Auto-generated method stub
		System.out.println("Pase de año validado");
		
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
		System.out.println("Matriculación de Eduarda Completa");
	}
}
