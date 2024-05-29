package vista;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.itextpdf.text.DocumentException;

import control.gestionarProductos;
import model.data.GenerarPdf;
import model.data.Producto;
import model.data.gestionFicheroTXT;

public class App {

	public static void main(String[] args) {
		int salir = 0;
		System.out.println("bienvenido a sr.While{Systems}");
		Scanner leer = new Scanner(System.in);
		int key =0;
		do {
			generarMenu();
			key = leer.nextInt();
			switch (key) {
			case 1:{
				boolean control = false;
				try {
					control = crearPdf();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (DocumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(control==true) {
					System.out.println("proceso realizado Correctamente");
				}
				else {
					System.out.println(" el archivo no ha podido generarse");
				}
			}
				break;
			case 2:{
				boolean control = false;
				try {
					control = crearTxt();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(control==true) {
					System.out.println("proceso realizado Correctamente");
				}
				else {
					System.out.println(" el archivo no ha podido generarse");
				}
			}
				break;
			default:
			salir = 3;
				break;
			}
		}
		while(key!=salir);

	}
	public static boolean crearTxt() throws SQLException, FileNotFoundException, IOException {
		gestionarProductos gestion = new gestionarProductos();
		gestionFicheroTXT fichero = new gestionFicheroTXT("productos.txt");
		ArrayList<String> guardarProductos = gestion.guardarProductos();
		fichero.abrirArchivo();
		System.out.println(" archivo abierto");
		boolean control = fichero.insertarDatos(guardarProductos);
		System.out.println(" archivo guardado");
		fichero.cerrarArchivo();
		System.out.println(" archivo cerrado");
		return control;
	}
	public static boolean crearPdf() throws SQLException, IOException, DocumentException {
		gestionarProductos gestion = new gestionarProductos();
		GenerarPdf generarpdf = new GenerarPdf("ejercicio3.pdf");
		ArrayList<Producto> agregarProductos = gestion.agregarProductos();
		ArrayList<String> agregarMenu = gestion.agregarMenu();
		generarpdf.openPdf();
		boolean control = generarpdf.setPdf(agregarProductos, agregarMenu);
		generarpdf.closePdf();
		return control;
	}
	public static void generarMenu() {
		System.out.println(" elige una opcion: ");
		System.out.println("1. generar un pdf");
		System.out.println("2. generar un txt");
	}

}
