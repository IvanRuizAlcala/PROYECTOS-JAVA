package model.data;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GenerarPdf {
	private String nombrePdf;
	private Phrase texto;
	private Phrase textoCabecera;
	Document document = new Document();
	public GenerarPdf(String nombrePdf) {
		super();
		this.nombrePdf = nombrePdf;
	}

	public void openPdf() throws IOException, DocumentException {
		
		Path ruta = Paths.get(System.getProperty("user.home"),"Desktop", "MODULO", "PROYECTOS JAVA", "archivosPdf",nombrePdf);
		OutputStream ficheroPdf = Files.newOutputStream(ruta);
		PdfWriter.getInstance(document, ficheroPdf).setInitialLeading(20);
		document.open();
		System.out.println("archivo abierto");
	}

	public Font insertarFuentes(String fuente) {
		Font arialNormal = new Font(FontFactory.getFont("arial", 8, Font.NORMAL, BaseColor.BLACK));
		Font arialNegrita = new Font(FontFactory.getFont("arial", 8, Font.BOLD, BaseColor.DARK_GRAY));
		if(fuente.equals(arialNegrita)) {
		return arialNegrita;
		}
		return arialNormal;
	}

	public void setPdf(ArrayList<Producto>archivoCompleto, ArrayList<String>cabecera) throws DocumentException {
		System.out.println("cargando archivo");
		System.out.println(cabecera.size());
		PdfPTable tableCab = new PdfPTable(cabecera.size());		
		for (String string : cabecera) {
			textoCabecera = new Phrase (string);
			tableCab.addCell(string);
		}
		for (int i = 0; i < cabecera.size(); i++) {
			for (int j = 0; j < archivoCompleto.size(); j++) {
				texto = new Phrase(archivoCompleto.get(j).getCodigo(),insertarFuentes("arialNormal"));
				tableCab.addCell(texto);
				texto = new Phrase(archivoCompleto.get(j).getNombre(),insertarFuentes("arialNormal"));
				tableCab.addCell(texto);
				texto = new Phrase(archivoCompleto.get(j).getCategoria(),insertarFuentes("arialNormal"));
				tableCab.addCell(texto);
				texto = new Phrase(archivoCompleto.get(j).getPcompra(),insertarFuentes("arialNormal"));
				tableCab.addCell(texto);
				texto = new Phrase(archivoCompleto.get(j).getPventa(),insertarFuentes("arialNormal"));
				tableCab.addCell(texto);
			}
		
		}
		document.add(tableCab);
		System.out.println("archivo cargado");
	}
	
	/*public void setPdfString(String cabecera, String archivo) throws DocumentException {
		System.out.println("vamos a cargar archivos");
		PdfPTable tableCab = new PdfPTable(1);
		textoCabecera = new Phrase(cabecera);
		tableCab.addCell(textoCabecera);
		texto = new Phrase(archivo);
		tableCab.addCell(texto);
		document.add(tableCab);
		System.out.println(" archivo cargado");
	}*/
	public void closePdf() {
		document.close();
		System.out.println("archivo cerrado");
	}
}
