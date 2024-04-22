package ejercicio_8;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int size = 0;
		String salir;
		Persona personaElegida = null;
		Scanner leer = new Scanner(System.in);
		System.out.println(" dime el tamaño del array");
		size = leer.nextInt();
		Cola misPersonas = new Cola(size);
		int opcion=0;
		
		do {
			
		
		System.out.println(" Bienvenidos a Sr While Systems");
		System.out.println(" elige una opcion: ");
		System.out.println(" opcion 1 : ver si el array esta vacio o no");
		System.out.println(" Opcion 2 : muestra el primer elemento de la estructura ");
		System.out.println(" Opcion 3 : extraer el elemento, sacarlos del array y permitir agregar otro en su lugar ");
		System.out.println(" Opcion 4 : insertar una nueva persona ");
		System.out.println(" Opcion 5 : mostrar el contenido del array");
		System.out.println(" Opcion 6 : Salir ");
		opcion = leer.nextInt();
		
		switch (opcion) {
		case 1:{
			System.out.println(misPersonas.estaVacia());
		}
			break;
		case 2:{
			System.out.println(misPersonas.primero());
		}
		break;
		case 3:{
			misPersonas.extraer();
		}
		break;
		case 4: {
			System.out.println(misPersonas.insertar());
		}
		break;
		case 5 : {
			misPersonas.mostrar();
		}
		break;
		}
		System.out.println(" quieres continuar? marca si para continuar, NO para salir");
		salir = leer.next();
	}
		while(salir.equals("si"));
		System.out.println(" has terminado");

	}
}
