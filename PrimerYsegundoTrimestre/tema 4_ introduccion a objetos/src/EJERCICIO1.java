import java.util.Scanner;

public class EJERCICIO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int contador=0;
		
		Scanner leer = new Scanner(System.in);
		String nombreElegido= "";
		String apellidosElegido= "";
		String NombreParaBuscar  = "";
		int edadElegido= 0;
		//ALGORITMO
		Persona Persona1 = new Persona("Maria", "", 300);
		System.out.println(Persona1);
		Persona1.setEdad(20);
		System.out.println(" dime los datos que quieres poner");
		System.out.println(" Nombre : ");
		nombreElegido = leer.next();
		System.out.println(" Apellidos :");
		apellidosElegido = leer.next();
		System.out.println(" Edad : ");
		edadElegido = leer.nextInt();
		Persona Persona2 = new Persona(nombreElegido, apellidosElegido, edadElegido);
		System.out.println(" ahora dime un nombre y te dire si esta ya creado");
		System.out.println(" Nombre : ");
		NombreParaBuscar = leer.next();
		if(Persona2.getNombre().equals(NombreParaBuscar)) {
			System.out.println(" la edad de " + Persona1.getEdad());
		}
		else {
			System.out.println("el nombre elegido no corresponde a ninguno, lo vamos a crear");
			Persona Persona3 = new Persona(NombreParaBuscar, " ", 0);
		}
		System.out.println(" dime los datos que quieres poner");
		Persona Persona4 = new Persona("carlos", "cano ", 33);
		Persona Persona5 = new Persona("Raquel", "Ramirez", 24);
		Persona Persona6 = new Persona("Guillermo", "vaquero", 18);
		Persona Persona7 = new Persona("manue", "lemus", 33);
		String nombres[] = {Persona1.getNombre(), Persona2.getNombre(), Persona4.getNombre(), Persona5.getNombre(),Persona6.getNombre(), Persona7.getNombre()};
		
		for(contador=0;contador<nombres.length;contador++) {
		System.out.println(nombres[contador]);
		}
		Persona datos []  = {Persona1,Persona2,Persona4,Persona5,Persona6,Persona7};
		System.out.println(datos[contador].getApellidos());
		}
		
	}


