package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReaderCsv {
private String nombreArchivo;
BufferedReader bufferEntrada;

public ReaderCsv(String nombreArchivo) {
	super();
	this.nombreArchivo = nombreArchivo;
}
public void createTxt() throws IOException {
	bufferEntrada= new BufferedReader(new FileReader(new File("clientes.csv")));
	System.out.println("Archivo abierto");
}
public ArrayList<Cliente> setTxt() throws IOException {
	int contador=0;
	ArrayList<String>cabecera = new ArrayList<>();
	ArrayList<Cliente>clientesTotales = new ArrayList<>();
	Cliente auxCliente;
	String linea=" ";
	while((linea=bufferEntrada.readLine())!=null) {
		String[] split = linea.split(";");
		if(contador==0) {
		for (int i = 0; i < split.length; i++) {
			cabecera.add(split[i]);
		}
		}
		else {	
			auxCliente = new Cliente(split[0],split[1],split[2],split[3]);
			clientesTotales.add(auxCliente);
		}
		contador++;
	}
	return clientesTotales;
	
}
public void closeTxt() throws IOException {
	bufferEntrada.close();
	System.out.println("archivo Cerrado");
}
}