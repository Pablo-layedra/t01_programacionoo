package ejercicios.interfaces;

public class CajeroProdubanco implements InterfazCajero {

	@Override
	public void solicitarTrajeta(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Leer tarjeta");
		
	}

	@Override
	public void solicitarClave(String clave) {
		// TODO Auto-generated method stub
		System.out.println("Comprobar clave");
		System.out.println("Analizar base de datos");
		System.out.println("Clave correcta");
	}

	@Override
	public void solicitarTipoTransaccion() {
		// TODO Auto-generated method stub
		System.out.println("Escoger tipo de transaccion");
		
	}

	@Override
	public void solicitarMonto(int monto) {
		// TODO Auto-generated method stub
		System.out.println("Comprobar dinero dentro de la cuenta");
		System.out.println("Leer monto");
	}

	@Override
	public void validarSaldo() {
		// TODO Auto-generated method stub
		System.out.println("Transaccion exitosa");
	}

	@Override
	public void entregarDinero() {
		// TODO Auto-generated method stub
		System.out.println("Total de dinero entrgado");
	}

	@Override
	public void realizarTransacción() {
		// TODO Auto-generated method stub
		System.out.println("Transaccion en progreso");
	}

	@Override
	public void entregarRecibo() {
		// TODO Auto-generated method stub
		System.out.println("Imprimir recibo");
	}
}
