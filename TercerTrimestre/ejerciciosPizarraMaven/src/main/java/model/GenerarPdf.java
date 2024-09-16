package model;

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

	public boolean setPdf(ArrayList<String>archivoCompleto, ArrayList<String>cabeceraDatos) throws DocumentException {
		PdfPTable cabecera =new PdfPTable(cabeceraDatos.size());
		for (String string : cabeceraDatos) {
			Phrase texto = new Phrase(string);
		}
		
	;
	return false;
	}
	public void closePdf() {
		document.close();
	}
}
