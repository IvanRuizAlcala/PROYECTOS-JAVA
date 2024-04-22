package ejercicio_8;

import java.util.Arrays;
import java.util.Scanner;

public class Cola implements interfazCola {
	private Persona [] cola;
	private int size;
	int posicion = 0;

	public Cola(int size) {
		super();
		cola = new Persona[size];
	}

	@Override
	public boolean estaVacia() {
		for (int i = 0; i <=posicion; i++) {
			if(posicion==0) {
				return true;
			}
		}
		return false;

	}

	@Override
	public Persona primero() {
		Persona primerValor = null;
		primerValor=cola[0];
		return primerValor;
	}

	@Override
	public void extraer() {
		
		Scanner leer = new Scanner(System.in);
		Persona elementoExtraible = null;
		int idPersonaElegidaPorUsuario;
		String nombrePersonaElegidaPorUsuario;
		System.out.println(" introduce el nombre de la persona a sustituir ");
		System.out.println(" dime su nombre :");
		nombrePersonaElegidaPorUsuario = leer.next();
		for (int i = 0; i <posicion; i++) {
			if(cola[i].getNombre().equals(nombrePersonaElegidaPorUsuario)) {
				cola[i].setNombre("vacio");
				cola[i].setId(0);
				System.out.println(" se ha realizado el proceso");
			}
	}
	}

	@Override
	public boolean insertar() {
		Scanner leer = new Scanner(System.in);
		Persona introducirPersona;
		int idPersonaElegidaPorUsuario;
		String nombrePersonaElegidaPorUsuario;
		System.out.println(" introduce una nueva persona ");
		System.out.println("dime su id :");
		idPersonaElegidaPorUsuario = leer.nextInt();
		System.out.println(" dime su nombre :");
		nombrePersonaElegidaPorUsuario = leer.next();
		introducirPersona = new Persona(idPersonaElegidaPorUsuario,nombrePersonaElegidaPorUsuario);
			if(posicion<cola.length) {
				cola[posicion]=introducirPersona;
				posicion++;
				return true;
			}
			if(posicion>=cola.length) {
				for (int i = 0; i < cola.length; i++) {
					if(cola[i].getNombre().equals("vacio")) {
						cola[i]=introducirPersona;
						return true;
					}
				}
			}
		
		return false;
	}

	@Override
	public void mostrar() {
	for (int i = 0; i <posicion; i++) {
			System.out.println(cola[i].toString());
		}

	}

	@Override
	public String toString() {
		return "Cola [cola=" + Arrays.toString(cola) + ", size=" + size + ", posicion=" + posicion + "]";
	}

}
