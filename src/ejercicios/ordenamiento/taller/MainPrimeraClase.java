package ejercicios.ordenamiento.taller;

import java.util.Arrays;

public class MainPrimeraClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estudiante Daniela=new Estudiante();
		Daniela.setNombre("Daniela");
		Daniela.setApellido("Lopez");
		Daniela.setEdad(20);
		Daniela.setNumeroLista(1);
		
		Estudiante Andres=new Estudiante();
		Andres.setNombre("Andres");
		Andres.setApellido("Asitimbay");
		Andres.setEdad(19);
		Andres.setNumeroLista(2);
		
		Estudiante alex=new Estudiante();
		alex.setNombre("Alex");
		alex.setApellido("Ojeda");
		alex.setEdad(20);
		alex.setNumeroLista(22);
		
		Estudiante stefany=new Estudiante();
		stefany.setNombre("Stefany");
		stefany.setApellido("Cruz");
		stefany.setEdad(21);
		stefany.setNumeroLista(10);
		
		Estudiante jhonny=new Estudiante();
		jhonny.setNombre("Jhonny");
		jhonny.setApellido("Fernandez");
		jhonny.setEdad(18);
		jhonny.setNumeroLista(21);
		
		alex.getEdad();
		System.out.println("Edad de Alex: "+alex.getEdad());

		jhonny.getEdad();
		System.out.println("Edad de Jhonny: "+jhonny.getEdad());
		
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
