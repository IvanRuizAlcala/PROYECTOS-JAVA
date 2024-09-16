package App;

import java.util.HashMap;
import java.util.Scanner;

import Class.Definicion;
import Class.GestionarDiccionario;

public class App {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		GestionarDiccionario misDiccionarios = new GestionarDiccionario();
		int opcion = 0;
		do {
			
		
		crearMenu();
		opcion= leer.nextInt();
		switch (opcion) {
		case 1:{
			misDiccionarios.addDiccionario();
			System.out.println(" se ha creado un nuevo diccionario");
		}
			
			break;
		case 2:{
			System.out.println(" dime un idioma para buscar el diccionario");
			String idioma;
			idioma = leer.next();
			misDiccionarios.addTerminos(idioma);
			System.out.println(" el termino se ha añadido correctamente");
		}
			break;
		case 3:
			System.out.println("indicame el termino elegido");
			String termino;
			termino = leer.next();
			misDiccionarios.modificarSignificado(termino);
			
			break;
		case 4:{
			String terminoElegido;
			HashMap<String,Definicion> listar = new HashMap();
			System.out.println(" dime un termino a buscar");
			terminoElegido = leer.next();
			listar = misDiccionarios.mostrarSignificadosPorTermino(terminoElegido);
			for (String string : args) {
				System.out.println(string);
				
			}
		}
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;

		default:{ System.out.println("la opcion no existe");
			break;
				}
			}
		}
		while(opcion!=6);
	}
public static void crearMenu() {
	System.out.println(" menu");
	System.out.println("1. añadir un diccionario");
	System.out.println("2. añadir terminos a un diccionario");
	System.out.println("3. añadir significados a un término que ya exista en el diccionario");
	System.out.println("4. mostrar los significados de un termino");
	System.out.println("5. Eliminar un significado de un termino");
	System.out.println("6. salir");
	System.out.print(" elige una opcion : ");
}
}
