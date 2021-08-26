package ejercicios.interfaces;

public class BibliotecaPUCE implements InterfazBiblioteca{
	
	@Override
	public void hacerRegistroDeIngresos(int numIngresos) {
		// TODO Auto-generated method stub
		System.out.println("Cantidad personar que ingresaron: "+numIngresos);
		
	}

	@Override
	public void organizarLibros() {
		// TODO Auto-generated method stub
		System.out.println("Organizar Libros por género:");
		System.out.println("Organizar Libros de crimen en orden alfabético");
	}

	@Override
	public void prenderComputadoras() {
		// TODO Auto-generated method stub
		System.out.println("Computadoras prendidas");
		
	}

	@Override
	public void solicitarIdentificación() {
		// TODO Auto-generated method stub
		System.out.println("Solicitar carnet de PUCE");
		System.out.println("Libro entregado: El Retrato de Dorian Grey, de Oscar Wilde");
	}

	@Override
	public void hacerRegistroLibrosPrestados(int numLibrosPres) {
		// TODO Auto-generated method stub
		System.out.println("Cantidad de libros prestados en el día: "+numLibrosPres);
	}

}
