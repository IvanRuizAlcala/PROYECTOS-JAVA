package App;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import Class.GestionProductos;
import Class.Producto;
import Class.openBBDD;

public class App {

	public static void main(String[] args) {
		ArrayList<String> totalProductos = new ArrayList<>();
		GestionProductos gestionarProductos = new GestionProductos();
		ArrayList<Producto> aux = new ArrayList<>();
		openBBDD abrirArchivo = new openBBDD("datosProductos.txt");
		try {
			abrirArchivo.abrirArchivo();
			totalProductos.addAll(abrirArchivo.insertarDatos());
			abrirArchivo.cerrarArchivo();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		aux.addAll(gestionarProductos.crearProductos(totalProductos));
		for (int i = 0; i < aux.size(); i++) {
			System.out.println(aux.get(i));
		}
	}

}
