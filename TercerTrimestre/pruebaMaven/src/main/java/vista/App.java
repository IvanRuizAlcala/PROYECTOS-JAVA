package vista;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.itextpdf.text.DocumentException;

import control.gestionarProductos;
import model.data.GenerarPdf;
import model.data.Producto;
import model.data.gestionFicheroTXT;

public class App {

	public static void main(String[] args) throws FileNotFoundException, IOException, DocumentException {
		gestionarProductos gestion = new gestionarProductos();
		gestionFicheroTXT fichero = new gestionFicheroTXT("productos.txt");
		GenerarPdf generarpdf = new GenerarPdf("uno.pdf");
		try {
			ArrayList<String> guardarProductos = gestion.guardarProductos();
			ArrayList<Producto> agregarProductos = gestion.agregarProductos();
			ArrayList<String> agregarMenu = gestion.agregarMenu();
			fichero.abrirArchivo();
			System.out.println(" archivo abierto");
			fichero.insertarDatos(guardarProductos);
			System.out.println(" archivo guardado");
			fichero.cerrarArchivo();
			System.out.println(" archivo cerrado");
			generarpdf.openPdf();
			generarpdf.setPdf(agregarProductos, agregarMenu);
			//generarpdf.setPdfString(archivo, cabecera);
			generarpdf.closePdf();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
