package ejercicios.interfaces;

public class ConsultorioTraumatologo implements InterfazConsultorio{
	
	@Override
	public void entregarTurno(String turno) {
		// TODO Auto-generated method stub
		System.out.println("Turno n�mero: "+turno);
	}

	@Override
	public void solicitarInformaci�n() {
		// TODO Auto-generated method stub
		System.out.println("Datos del paciente");
	}

	@Override
	public void hacerDiagnostico() {
		// TODO Auto-generated method stub
		System.out.println("Dislocaci�n de hombro");
	}

	@Override
	public void recetarTratamiento() {
		// TODO Auto-generated method stub
		System.out.println("Recetar pastillas para el dolor");
		System.out.println("Indicar ejercicios de recuperaci�n");
		System.out.println("Entregar venda para el hombro");
	}

	@Override
	public void cobrarConsulta(int pago) {
		// TODO Auto-generated method stub
		System.out.println("Pago consulta: "+pago);
	}

}
