package model.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

import control.Usuario;

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

	public boolean insertarDatos(ArrayList<Usuario>archivoCompleto) throws IOException {
		boolean control = false;
		for (Usuario string : archivoCompleto) {
			bufferEntrada.write(string.getUserName());
			bufferEntrada.write(string.getPassword());
			bufferEntrada.write(string.getUserType());
			bufferEntrada.newLine();
		}
		System.out.println(" datos insertados");
		if(archivoCompleto!=null) {
			control = true;
		}
		return control;
	}

	public void cerrarArchivo() throws FileNotFoundException, IOException {
		bufferEntrada.close();
		System.out.println(" archivo cerrado");
		
	}
	
}