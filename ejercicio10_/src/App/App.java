package App;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import Class.GestionFichero;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestionFichero gestion = new GestionFichero("GestionAlumnos");
		ArrayList<String> aux = new ArrayList<>();
		try {
			gestion.abrirArchivo();
		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}
		try {
			aux = gestion.insertarDatos();
		} catch (IOException e) {
			e.getMessage();
		}
		try {
			gestion.cerrarArchivo();
		} catch (IOException e) {

		}
	gestion.CrearAlumnos(aux);
	}

}
