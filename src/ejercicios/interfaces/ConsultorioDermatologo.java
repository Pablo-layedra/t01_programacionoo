package ejercicios.interfaces;

public class ConsultorioDermatologo implements InterfazConsultorio{

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
		System.out.println("Existencia de verrugas");
	}

	@Override
	public void recetarTratamiento() {
		// TODO Auto-generated method stub
		System.out.println("Recetar crema m�dica especial");
	}

	@Override
	public void cobrarConsulta(int pago) {
		// TODO Auto-generated method stub
		System.out.println("Pago consulta: "+pago);
	}

}
