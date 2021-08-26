package ejercicios.interfaces;

public class ConsultorioTraumatologo implements InterfazConsultorio{
	
	@Override
	public void entregarTurno(String turno) {
		// TODO Auto-generated method stub
		System.out.println("Turno número: "+turno);
	}

	@Override
	public void solicitarInformación() {
		// TODO Auto-generated method stub
		System.out.println("Datos del paciente");
	}

	@Override
	public void hacerDiagnostico() {
		// TODO Auto-generated method stub
		System.out.println("Dislocación de hombro");
	}

	@Override
	public void recetarTratamiento() {
		// TODO Auto-generated method stub
		System.out.println("Recetar pastillas para el dolor");
		System.out.println("Indicar ejercicios de recuperación");
		System.out.println("Entregar venda para el hombro");
	}

	@Override
	public void cobrarConsulta(int pago) {
		// TODO Auto-generated method stub
		System.out.println("Pago consulta: "+pago);
	}

}
