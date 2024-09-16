package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Paths;
import java.util.ArrayList;

public class GenerateTxt {
private String nombreArchivo;
BufferedWriter bufferEntrada;

public GenerateTxt(String nombreArchivo) {
	super();
	this.nombreArchivo = nombreArchivo;
}
public void createTxt() throws IOException {
	bufferEntrada = new BufferedWriter(new FileWriter(new File(nombreArchivo)));
	System.out.println("Archivo creado");
}
public void setTxt(ArrayList<Usuario>usuarios, ArrayList<String>cabeceraTxt) throws IOException {
	ArrayList<String>listaUsuario = new ArrayList<>();
	String usuarioTexto = " ";
	String id;
	String nombreusuario;
	String password;
	String tipoUsuario;
	String linea = " ";
	String cabecera = cabeceraTxt.get(0) +" "+cabeceraTxt.get(1) + " " + cabeceraTxt.get(2) + " " + cabeceraTxt.get(3);
	bufferEntrada.write(cabecera);
	bufferEntrada.newLine();
	for (Usuario usuario : usuarios) {
		id=Integer.toString(usuario.getId());
		nombreusuario = usuario.getNombreUsuario();
		password = usuario.getPassword();
		tipoUsuario = usuario.getTipoUsuario();
		usuarioTexto = id +" "+nombreusuario +" "+password+" "+tipoUsuario+" ";
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
