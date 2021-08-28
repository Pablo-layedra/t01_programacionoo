package ejercicios.ordenamiento;

import java.util.Arrays;

public class MainPrimeraClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estudiante Daniela=new Estudiante();
		Daniela.setNombre("Daniela");
		Daniela.setNumeroLista(1);
		
		Estudiante Andres=new Estudiante();
		Andres.setNombre("Andres");
		Andres.setNumeroLista(2);
		
		Estudiante alex=new Estudiante();
		alex.setNombre("Alex");
		alex.setNumeroLista(22);
		
		Estudiante stefany=new Estudiante();
		stefany.setNombre("Stefany");
		stefany.setNumeroLista(10);
		
		Estudiante jhonny=new Estudiante();
		jhonny.setNombre("Jhonny");
		jhonny.setNumeroLista(21);
		
		alex.getNumeroLista();
		System.out.println("Numero de lista de Alex: "+alex.getNumeroLista());

		jhonny.getNumeroLista();
		System.out.println("Numero de lista de Jhonny: "+jhonny.getNumeroLista());
		
		Estudiante listaEstudiantes[]=new Estudiante [5];
		listaEstudiantes[0]=Daniela;
		listaEstudiantes[1]=Andres;
		listaEstudiantes[2]=alex;
		listaEstudiantes[3]=stefany;
		listaEstudiantes[4]=jhonny;
		
		System.out.println("Estudiantes antes de ordenar");
		System.out.println(Arrays.toString(listaEstudiantes));
		
		Arrays.sort(listaEstudiantes);
		
		System.out.println(Arrays.toString(listaEstudiantes));
		
	}

}
