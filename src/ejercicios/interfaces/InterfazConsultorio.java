package ejercicios.interfaces;

public interface InterfazConsultorio {
	
	public void entregarTurno(String turno);
	public void solicitarInformación();
	public void hacerDiagnostico();
	public void recetarTratamiento();
	public void cobrarConsulta(int pago);

}
