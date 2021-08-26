package ejercicios.interfaces;

public interface InterfazCajero {
	
	public void solicitarTrajeta(String numero);
	public void solicitarClave(String clave);
	public void solicitarTipoTransaccion();
	public void solicitarMonto(int monto);
	public void validarSaldo();
	public void entregarDinero();
	public void realizarTransacción();
	public void entregarRecibo();

}
