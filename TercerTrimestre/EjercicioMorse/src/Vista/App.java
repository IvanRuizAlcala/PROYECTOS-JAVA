package Vista;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Control.GestionArchivos;
import Model.Morse;

public class App {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//Datos
		Scanner leer = new Scanner(System.in);
		String nombreArchivoElegidoUsuario = " ";
		List<Morse> palabrasEnMorse = new ArrayList<>();
		List<String> textoCompleto = new ArrayList<>();
		Morse morse;
		String aux =" ";
		List<String>leerDerdeArchivoDeTexto = new ArrayList<>();
		String [] auxArchivo;
		//Aplicacion
		System.out.println(" Bienvenido a Sr.While{Systems}");
		System.out.println(" vamos a leer el archivo");
		System.out.println("leyendo Archivo");
		List<String> leerDesdeArchivoDeTexto = GestionArchivos.leerDesdeArchivoDeTexto("textoMorse.txt");
		auxArchivo = new String[leerDerdeArchivoDeTexto.size()];
		System.out.println("archivo guardado");
		for (int i = 0; i < leerDesdeArchivoDeTexto.size(); i++) {
			auxArchivo = leerDerdeArchivoDeTexto.get(i).split(";");
			morse = new Morse(auxArchivo);
			palabrasEnMorse.add(morse);
		}
		System.out.println("proceso de traduccion Iniciado");
		for (int i = 0; i < palabrasEnMorse.size(); i++) {
		textoCompleto.add(palabrasEnMorse.get(i).traductorMorse());
		}
		System.out.println(" traduccion Completada");
		System.out.println(" dime el nombre del archivo,");
		nombreArchivoElegidoUsuario = leer.next();
		GestionArchivos.escribirEnArchivo(textoCompleto,nombreArchivoElegidoUsuario );
		
	}

}
