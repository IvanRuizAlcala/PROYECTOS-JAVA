package model.data;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
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
	}

	public Font insertarFuentes(String fuente) {
		Font arialNormal = new Font(FontFactory.getFont("arial", 8, Font.NORMAL, BaseColor.BLACK));
		Font arialNegrita = new Font(FontFactory.getFont("arial", 8, Font.BOLD, BaseColor.DARK_GRAY));
		if(fuente.equals(arialNegrita)) {
		return arialNegrita;
		}
		return arialNormal;
	}

	public boolean setPdf(ArrayList<Producto>archivoCompleto, ArrayList<String>cabeceraDatos) throws DocumentException {
		boolean control =false;
		String saltoLinea="";
		String listado  = "Listado de Productos con precio entre 1.0 y 200.0";
		int numColumns = 1;
		LocalDate fecha = LocalDate.now();
		DateTimeFormatter formatearFecha = DateTimeFormatter.ofPattern("YYYY-MM-dd");
		String fechaNow = fecha.format(formatearFecha); 
		PdfPTable cabecera= new PdfPTable(numColumns);
		Phrase textoCabecera = new Phrase(listado,insertarFuentes("arialNegrita"));
		cabecera.addCell(textoCabecera);
		textoCabecera = new Phrase(fechaNow,insertarFuentes("arialNegrita"));
		cabecera.addCell(textoCabecera);
		PdfPTable tablaDatos = new PdfPTable(cabeceraDatos.size());		
		for (String string : cabeceraDatos) {
			textoCabecera = new Phrase (string);
			tablaDatos.addCell(string);
		}
			for (int j = 0; j < archivoCompleto.size(); j++) {
				texto = new Phrase(archivoCompleto.get(j).getCodigo(),insertarFuentes("arialNormal"));
				tablaDatos.addCell(texto);
				texto = new Phrase(archivoCompleto.get(j).getNombre(),insertarFuentes("arialNormal"));
				tablaDatos.addCell(texto);
				texto = new Phrase(archivoCompleto.get(j).getVendedor(),insertarFuentes("arialNormal"));
				tablaDatos.addCell(texto);
				texto = new Phrase(archivoCompleto.get(j).getPventa(),insertarFuentes("arialNormal"));
				tablaDatos.addCell(texto);
			}
		document.add(cabecera);
		document.add(new Paragraph(" "));
		document.add(tablaDatos);
		if(document!=null) {
			control=true;
		}
		return control;
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
	}
}
