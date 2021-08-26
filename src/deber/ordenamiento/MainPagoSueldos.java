package deber.ordenamiento;

import java.util.Arrays;

public class MainPagoSueldos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trabajador favian=new Trabajador();
		favian.setNombre("Favian");
		favian.setApellido("Lopez");
		favian.setEdad(30);
		favian.setSueldo(1500);
		
		Trabajador omar=new Trabajador();
		omar.setNombre("Omar");
		omar.setApellido("Ordoñez");
		omar.setEdad(27);
		omar.setSueldo(1400);
		
		Trabajador alberto=new Trabajador();
		alberto.setNombre("Alberto");
		alberto.setApellido("Escudero");
		alberto.setEdad(32);
		alberto.setSueldo(1500);
		
		Trabajador damian=new Trabajador();
		damian.setNombre("Damian");
		damian.setApellido("Herrera");
		damian.setEdad(40);
		damian.setSueldo(2500);
		
		Trabajador susana=new Trabajador();
		susana.setNombre("Susana");
		susana.setApellido("de la Cruz");
		susana.setEdad(26);
		susana.setSueldo(1200);
		
		Trabajador valeria=new Trabajador();
		valeria.setNombre("Valeria");
		valeria.setApellido("Pino");
		valeria.setEdad(35);
		valeria.setSueldo(2500);
		
		Trabajador john=new Trabajador();
		john.setNombre("John");
		john.setApellido("Iglesias");
		john.setEdad(29);
		john.setSueldo(1600);
		
		Trabajador david=new Trabajador();
		david.setNombre("David");
		david.setApellido("Moreno");
		david.setEdad(32);
		david.setSueldo(2000);
		
		Trabajador alejandra=new Trabajador();
		alejandra.setNombre("Alejandra");
		alejandra.setApellido("Suasnavas");
		alejandra.setEdad(28);
		alejandra.setSueldo(1750);
		
		Trabajador brian=new Trabajador();
		brian.setNombre("Brian");
		brian.setApellido("Suntaxi");
		brian.setEdad(33);
		brian.setSueldo(1000);
		
		Trabajador pablo=new Trabajador();
		pablo.setNombre("Pablo");
		pablo.setApellido("Molina");
		pablo.setEdad(29);
		pablo.setSueldo(3000);
		
		
		Trabajador listaSueldos[]=new Trabajador [11];
		listaSueldos[0]=favian;
		listaSueldos[1]=omar;
		listaSueldos[2]=alberto;
		listaSueldos[3]=damian;
		listaSueldos[4]=susana;
		listaSueldos[5]=valeria;
		listaSueldos[6]=john;
		listaSueldos[7]=david;
		listaSueldos[8]=alejandra;
		listaSueldos[9]=brian;
		listaSueldos[10]=pablo;
		
		System.out.println("Ordenar la lista de trabajadores en base al sueldo");
		System.out.println(Arrays.toString(listaSueldos));
		
		Arrays.sort(listaSueldos);
		
		System.out.println(Arrays.toString(listaSueldos));

	}

}
