package model;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;



public class GeneratePdfUsuarios {
	private String nombreArchivo;
	Document documento = new Document();
	public GeneratePdfUsuarios(String nombreArchivo) {
		super();
		this.nombreArchivo = nombreArchivo;
	}
	public void openPdf() throws IOException, DocumentException {
		Path ruta = Paths.get(System.getProperty("user.home"),"Desktop", "modulo", "PROYECTOS JAVA", "archivosPdf", nombreArchivo);
		OutputStream archivoPdf = Files.newOutputStream(ruta);
		PdfWriter.getInstance(documento, archivoPdf).setInitialLeading(20);
		documento.open();
	}
	public void setPdf(ArrayList<Usuario> usuarios, ArrayList<String> cabecera) throws DocumentException {
		int numColumns = 4;
		PdfPTable cabeceraPdf = new PdfPTable(cabecera.size());
		Phrase texto = new Phrase();
		for (String string : cabecera) {
			texto = new Phrase(string);
			cabeceraPdf.addCell(texto);
		}
		for (Usuario usuario  : usuarios) {
			texto = new Phrase(String.valueOf(usuario.getId()));
			cabeceraPdf.addCell(texto);
			texto = new Phrase(usuario.getNombreUsuario());
			cabeceraPdf.addCell(texto);
			texto = new Phrase(usuario.getPassword());
			cabeceraPdf.addCell(texto);
			texto = new Phrase(usuario.getTipoUsuario());
			cabeceraPdf.addCell(texto);
		}
		documento.add(cabeceraPdf);
	}
	public void closePdf() {
		documento.close();
	}
	
}
