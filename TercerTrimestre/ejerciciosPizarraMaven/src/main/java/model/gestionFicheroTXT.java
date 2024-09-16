package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class gestionFicheroTXT {
	String nombreArchivo;
	BufferedReader bufferEntrada;


	public gestionFicheroTXT(String nombreArchivo) {
		super();
		this.nombreArchivo = nombreArchivo;
	}

	public void abrirArchivo() throws FileNotFoundException, IOException {
		bufferEntrada = new BufferedReader(new FileReader(nombreArchivo));
		System.out.println(" archivo abierto");
	}

	public ArrayList<String> insertarDatos() throws IOException {
	
	ArrayList<String> misPaises = new ArrayList<>();
	String linea=" ";
		while((linea=bufferEntrada.readLine()) != null) {
			misPaises.add(linea);
		}
		return misPaises;
		
}
	public void cerrarArchivo() throws FileNotFoundException, IOException {
		bufferEntrada.close();
		System.out.println(" archivo cerrado");
		
	}
	
}