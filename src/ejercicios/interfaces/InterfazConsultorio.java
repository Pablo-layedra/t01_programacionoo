package ejercicios.interfaces;

public interface InterfazConsultorio {
	
	public void entregarTurno(String turno);
	public void solicitarInformaci�n();
	public void hacerDiagnostico();
	public void recetarTratamiento();
	public void cobrarConsulta(int pago);

}
