package ejercicios.interfaces;

public class JardineroVecino implements InterfazJardinero {
	
	public void regar() {
		System.out.println("Abrir llave");
		System.out.println("Recoger manguera");
		System.out.println("Cloro al agua");
		System.out.println("Mojar cesped");
	}
	
	public void cortar() {
		System.out.println("Encender maquina");
		System.out.println("Podar cesped");
		System.out.println("Cortar por la mitad de linea");
	}
	
	public void abonar() {
		System.out.println("Bajar el abono");
		System.out.println("Regar por partes");
	}

	@Override
	public void fertilizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cocinar() {
		// TODO Auto-generated method stub
		
	}

}
