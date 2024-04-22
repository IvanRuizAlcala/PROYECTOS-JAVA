package App;

import java.util.ArrayList;
import java.util.Scanner;

import Class.GestionProductos;
import Class.Productos;

public class App {

	public static void main(String[] args) {
		int opcion;
		GestionProductos gestion = new GestionProductos();
	
		do {
			System.out.println("");
			opcion=crearMenu();
		switch (opcion) {
		case 1:{
			gestion.nuevoProducto();
		}
			
			break;
		case 2:{
			int idAeliminar;
			Scanner leer = new Scanner(System.in);
			System.out.print(" dime un id que quieras eliminar: ");
			idAeliminar = leer.nextInt();
			System.out.println(gestion.eliminarProducto(idAeliminar));
			
		}
		break;
		case 3:{
			ArrayList<Productos> guardarArray;
			guardarArray=gestion.devolverArray();
			System.out.println(" el array se ha guardado correctamente");
			for (Productos productos : guardarArray) {
				System.out.println(productos);
			}
		}
		break;
		case 4:{
			Scanner leer = new Scanner(System.in);
			String tipo;
			System.out.println(" dime el tipo de producto");
			tipo=leer.next();
			gestion.devolverProductosPorTipo(tipo);
		}
		break;
		case 5:{
			gestion.eliminarProductosCongelados();
		}
		break;
		case 6:{
			gestion.visualizarArray();
		}
			break;
		case 7:{
			System.out.println(" has finalizado");
		}
		default:{
			System.out.println(" la opcion seleccionada no existe");
		}
			break;
		}
		
		}
		
		while (opcion!=7);
		

	}
public static int crearMenu() {
	int opcion ;
	Scanner leer = new Scanner(System.in);
	System.out.println(" bienvenido a Sr while Systems");
	System.out.println(" Menu Gestionar Productos :");
		System.out.println("Opcion 1 - crear un nuevo producto");
		System.out.println("Opcion 2 - eliminar un producto");
		System.out.println("Opcion 3 - devolver productos");
		System.out.println("Opcion 4 - devolver productos segun su tipo");
		System.out.println("Opcion 5 - Eliminar productos congelados");
		System.out.println("Opcion 6 - visualizar productos");
		System.out.println("Opcion 7 - salir");
		System.out.print(" elige una opcion : ");
		opcion = leer.nextInt();
		System.out.println(" ");
		return opcion;
		
	}


}

