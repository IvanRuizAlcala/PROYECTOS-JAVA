package ejercicio4;

import java.util.HashMap;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		HashMap<String, String> cliente = new HashMap<>();
		Scanner leer = new Scanner(System.in);
		int key = 0;
		
		do {
			insertarMenu();
			key= leer.nextInt();
		switch (key) {
		case 1:{
			String nombre;
			String dni;
			System.out.println(" elije un nombre");
			nombre = leer.next();
			System.out.println(" elije un DNI");
			dni = leer.next();
			cliente.put(nombre, dni);
		}
			break;
		case 2:{
			
			String buscar;
			System.out.println(" dime un nombre por el que buscar");
			buscar = leer.next();
			if(cliente.containsKey(buscar)) {
				System.out.println(cliente.containsKey(buscar));
			}
		}
			break;
		case 3:{
			String eliminarNombre = null;
			System.out.println(" dime el dni a buscar");
			eliminarNombre = leer.next();
			if(cliente.containsKey(eliminarNombre)) {
			cliente.remove(eliminarNombre);	
			}
		}
			break;
		case 4:{
			System.out.println(cliente);
		}
			break;
		default:
			break;
		}	
	}
		while(key!=7);
	}
public static void insertarMenu() {
	
	System.out.println(" bienvenidos a Sr While Systems");
	System.out.println(" elije una opcion el menu:");
	System.out.println("1 : crear hansmap");
	System.out.println("2 : buscar un hansmap ");
	System.out.println("3 : eliminar ");
	System.out.println("4 : visualizar");
	
	
}
}
