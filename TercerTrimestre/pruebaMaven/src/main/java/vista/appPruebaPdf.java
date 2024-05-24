package vista;

import java.io.IOException;
import java.util.ArrayList;

import com.itextpdf.text.DocumentException;

import model.data.GenerarPdf;

public class appPruebaPdf {

	public static void main(String[] args) throws IOException, DocumentException {
		GenerarPdf generarpdf = new GenerarPdf("sextoArchivo.pdf");
		ArrayList<String>cabecera  = new ArrayList<>();
		ArrayList<String>archivo  = new ArrayList<>();
		cabecera.add("pruebacabecera");
		cabecera.add("pruebacabecera2");
		archivo.add("pruebaTexto");
		archivo.add("pruebaTexto");
		archivo.add("pruebaTexto");
		archivo.add("pruebaTexto");
		archivo.add("pruebaTexto");
		//String cabecera = "prueba";
		//String archivo =" prueba2";
		generarpdf.openPdf();
	//	generarpdf.setPdf(archivo, cabecera);
		//generarpdf.setPdfString(archivo, cabecera);
		generarpdf.closePdf();

	}

}
