package ejerciciopizarra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int opcion = 0;
		int posicionElegidaPorUsuarioParaBorrar;
		int posicionElegidaPorUsuarioParaModificar;
		int numeroAmodificar;
		int numeroModificado;
		int añadirNumero;
		ArrayList<Integer>  menu = new ArrayList<>();
		Scanner leer = new Scanner(System.in);
		System.out.println(" welcome to sr while systems");
		do {
			System.out.println("elige una opcion del menu: ");
			System.out.println("1. añadir un numero ");
			System.out.println("2. eliminar número " );
			System.out.println("3. modificar numero");
			System.out.println("4. tamaño lista");
			System.out.println("5. vaciar lista");
			System.out.println("6. mostrar Array");
			System.out.println("7. compara numeros");
			System.out.println("8. salir ");
	opcion = leer.nextInt();
		switch ( opcion) {
		case 1 : {
			System.out.println(" dime un numero que quieras añadir");
			añadirNumero = leer.nextInt();
			menu.add(añadirNumero);
			break;
		}
		case 2 :{
			System.out.println("dime la posicion a eliminar");
			posicionElegidaPorUsuarioParaBorrar = leer.nextInt();
			menu.remove(posicionElegidaPorUsuarioParaBorrar);
			break;
		}
		case 3: {
			System.out.println("dime el numero nuevo y la posicion del antiguo que quieres modificar");
			System.out.println(" dime la posicion");
			posicionElegidaPorUsuarioParaModificar = leer.nextInt();
			System.out.println(" dime el numero a modificar");
			numeroAmodificar=leer.nextInt();
			menu.set(posicionElegidaPorUsuarioParaModificar,numeroAmodificar);
			break;
		}
		case 4:{
			System.out.println(" el tamaño de la lista es :" + menu.size());
			break;
		}
		case 5: {
			System.out.println(" vamos a vaciar la lista");
			menu.clear();
			System.out.println(" la lista esta ahora vacia");
			break;
		}
		case 6:{
			System.out.println(menu);
		}
		break;
		case 7:{
			menu.sort(new Comparator<Integer>() {
				public int compare(Integer num1, Integer num2) {
					return num1.compareTo(num2);
				}
			});
		}
		break;
		}

	}
	while(opcion!=8);
		System.out.println(" has salido, saludos cordiales ");
	}
}
