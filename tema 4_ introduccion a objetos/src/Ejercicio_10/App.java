package Ejercicio_10;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcionElegidaPorUsuario =0;
		String [] selectorOpciones= {"1. Insertar nuevo programa ","2. Mostrar lista de software",
				"3. Filtrar por licencia ",	"4. Filtrar por función","5. Eliminar el último elemento",
				"6. Buscar programa por nombre y retornar programa ","7. Salir "};
		Menu1 [] menu = new Menu1(selectorOpciones);
		int salir=7;
		String programaElegidoPorUsuario = " ";
		Programa programaRetornado = null;
		String licenciaElegidaPorUsuario = "";
		String funcionElegidaPorUsuario="";
		Scanner leer = new Scanner(System.in);
		GestionPrograma listaPrograma = new GestionPrograma();
		System.out.println(" bienvenidos a srWhile Systems");
		System.out.println(" ");
		do {
			
			System.out.println(" indicar una opcion del menu : ");
			
			
			
			
			
			System.out.println("1. Insertar nuevo programa ");
			System.out.println("2. Mostrar lista de software");
			System.out.println("3. Filtrar por licencia ");
			System.out.println("4. Filtrar por función");
			System.out.println("5. Eliminar el último elemento");
			System.out.println("6. Buscar programa por nombre y retornar programa ");
			System.out.println("7. Salir ");
			opcionElegidaPorUsuario = leer.nextInt();
			switch (opcionElegidaPorUsuario) {
			
			case 1: {
				listaPrograma.InsertarNuevoPrograma();
				System.out.println();
			}
			break;
			case 2:{
				listaPrograma.mostrarLista();
				System.out.println();
			}
			break;
			case 3: {
				System.out.println("dime una licencia para buscar");
				licenciaElegidaPorUsuario = leer.next();
				listaPrograma.filtrarLicencia(licenciaElegidaPorUsuario);
				System.out.println();
			}
			break;
			case 4: {
				System.out.println("dime una funcion para buscar");
				funcionElegidaPorUsuario = leer.next();
				listaPrograma.filtrarPorFuncion(funcionElegidaPorUsuario);
				System.out.println();
			}
			break;
			case 5:{
				listaPrograma.eliminarUltimoElemento();
				System.out.println(" ultimo elemento eliminado");
				System.out.println();
			}
			break;
			case 6: {
				programaRetornado = listaPrograma.buscarProgramaPorNombre();
				System.out.println(programaRetornado);
			}
			break;
			}
		}
		while(opcionElegidaPorUsuario<salir);
		System.out.println(" has terminado, gracias por utilizar nuestro sistema");
		
	
		
		

	}

}
