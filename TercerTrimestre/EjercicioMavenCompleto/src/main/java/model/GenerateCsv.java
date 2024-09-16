package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Paths;
import java.util.ArrayList;

public class GenerateCsv {
private String nombreArchivo;
BufferedWriter bufferEntrada;

public GenerateCsv(String nombreArchivo) {
	super();
	this.nombreArchivo = nombreArchivo;
}
public void createTxt() throws IOException {
	bufferEntrada = new BufferedWriter(new FileWriter(new File(nombreArchivo)));
	System.out.println("Archivo creado");
}
public void setTxt(ArrayList<Cliente>clientes, ArrayList<String>cabeceraTxt) throws IOException {
	ArrayList<String>listaUsuario = new ArrayList<>();
	String usuarioTexto = " ";
	String nombreUsuario;
	String telefono;
	String ciudad;
	String pais;
	String linea = " ";
	String cabecera = cabeceraTxt.get(0) +";"+cabeceraTxt.get(1) + ";" + cabeceraTxt.get(2) + ";" + cabeceraTxt.get(3)+";";
	bufferEntrada.write(cabecera);
	bufferEntrada.newLine();
	for (Cliente cliente : clientes) {
		nombreUsuario = cliente.getNombreCliente();
		telefono = cliente.getTelefono();
		ciudad = cliente.getCiudad();
		pais = cliente.getPais();
		usuarioTexto=nombreUsuario+";"+telefono+";"+ciudad+";"+pais+";";
		bufferEntrada.write(usuarioTexto);
		bufferEntrada.newLine();
	}
	System.out.println("datos insertados");
}
public void closeTxt() throws IOException {
	bufferEntrada.close();
	System.out.println("archivo Cerrado");
}
}