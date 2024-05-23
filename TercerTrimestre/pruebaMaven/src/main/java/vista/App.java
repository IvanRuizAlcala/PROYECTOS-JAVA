package vista;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import control.gestionFicheroTXT;
import control.gestionarProductos;

public class App {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		gestionarProductos gestion = new gestionarProductos();
		gestionFicheroTXT fichero = new gestionFicheroTXT("productos.txt");
		try {
			ArrayList<String> guardarProductos = gestion.guardarProductos();
			fichero.abrirArchivo();
			System.out.println(" archivo abierto");
			fichero.insertarDatos(guardarProductos);
			System.out.println(" archivo guardado");
			fichero.cerrarArchivo();
			System.out.println(" archivo cerrado");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
