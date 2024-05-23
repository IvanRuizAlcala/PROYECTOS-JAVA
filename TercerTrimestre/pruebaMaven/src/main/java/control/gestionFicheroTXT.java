package control;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;
import java.io.BufferedWriter;

public class gestionFicheroTXT {
	String nombreArchivo;
	BufferedWriter bufferEntrada;


	public gestionFicheroTXT(String nombreArchivo) {
		super();
		this.nombreArchivo = nombreArchivo;
	}

	public void abrirArchivo() throws FileNotFoundException, IOException {
		bufferEntrada = new BufferedWriter(new FileWriter(nombreArchivo));
		System.out.println(" archivo abierto");
	}

	public void insertarDatos(ArrayList<String>archivoCompleto) throws IOException {
		for (String string : archivoCompleto) {
			bufferEntrada.write(string);
			bufferEntrada.newLine();
		}
		System.out.println(" datos insertados");
	}

	public void cerrarArchivo() throws FileNotFoundException, IOException {
		bufferEntrada.close();
		System.out.println(" archivo cerrado");
		
	}

}