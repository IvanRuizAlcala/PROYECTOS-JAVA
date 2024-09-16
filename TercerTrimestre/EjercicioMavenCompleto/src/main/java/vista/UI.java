package vista;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.log.SysoCounter;

import control.Gestion;
import model.Cliente;
import model.GenerateCsv;
import model.GeneratePdfClientes;
import model.GeneratePdfUsuarios;
import model.GenerateTxt;
import model.ReaderCsv;
import model.Usuario;

public class UI {

	public static void main(String[] args) throws SQLException, IOException, DocumentException {
		int opcionAnadirClientesEspanoles = 0;
		ReaderCsv leerCsv;
		int opcionCrearTablaClientes=0;
		int opcion=0;
		int salir=8;
		Gestion gestion = new Gestion();
		GeneratePdfClientes generarPdfCliente;
		GeneratePdfUsuarios generarPdf;
		GenerateTxt generarTxt;
		GenerateCsv generarCsv;
		Scanner leer = new Scanner(System.in);
		System.out.println("bienvenido a sr while system");
		Boolean crearTabla = gestion.crearTabla();
		if(crearTabla==true) {
			System.out.println("tabla creada correctamente");
		}
		else {
			System.out.println("tabla ya existente, no es necesario crearla");
		}
		do {
			crearMenu();
			opcion =leer.nextInt();
			switch (opcion) {
			case 1:{
				String tipoUsuario = " ";
				System.out.println(" dime el nombre: ");
				String nombre = leer.next();
				System.out.println("dime la contraseña");
				String password = leer.next();
				System.out.println("elige el tipo de usuario, pulsa 1 para Administrador, pulsa 2 para usuario normal");
				int eleccion = leer.nextInt();
				if(eleccion==1) {
					tipoUsuario="administrador";
				}
				if(eleccion==2) {
					tipoUsuario="normal";
				}
				boolean crearUsuarios = gestion.crearUsuarios(nombre, password, tipoUsuario);
				if(crearUsuarios==true) {
					System.out.println("usuario creado correctamente");
				}
				else {
					System.out.println("el usuario no se ha podido crear correctamente");
				}
			}
				
				break;
			case 2: {
				String nombreElegido=" ";
				String passwordElegido=" ";
				System.out.println("dime el nombre de usuario");
				nombreElegido = leer.next();
				System.out.println("dime la contraseña");
				passwordElegido = leer.next();
				ArrayList<String> visualizarTablas = gestion.visualizarTablas(nombreElegido, passwordElegido);
				for (String string : visualizarTablas) {
					System.out.println(string);
				}
				
			}
				break;
			case 3: {
				String[] datos = {"id","nombreUsuario","password","tipoUsuario"};
				System.out.println(" opciones disponibles");
				System.out.println("0. id");
				System.out.println("1. nombre de usuario");
				System.out.println("2. contraseña");
				System.out.println("3. tipo de usuario");
				int opcionElegida = leer.nextInt();
				String eleccionUsuario = datos[opcionElegida];
				System.out.println(" dime " + eleccionUsuario + " a buscar");
				String condicionElegidaUsuario = leer.next();
				ArrayList<Usuario> filtroPersonalizadoDeBusqueda = gestion.filtroPersonalizadoDeBusqueda(opcionElegida, condicionElegidaUsuario);
				System.out.println(" este es el resultado de su busqueda: ");
				for (Usuario usuario : filtroPersonalizadoDeBusqueda) {
					System.out.println(usuario);
				}
			}
				break;
			case 4: {
				System.out.println("generando archivo PDF");
				ArrayList<Usuario> listadoCompletoActualizado = gestion.listadoCompletoActualizado();
				ArrayList<String> guardarNombreColumnas = gestion.guardarNombreColumnas();
				generarPdf = new GeneratePdfUsuarios("listadoUsuarios.pdf");
				generarPdf.openPdf();
				generarPdf.setPdf(listadoCompletoActualizado, guardarNombreColumnas);
				generarPdf.closePdf();
				Path ruta = Paths.get(System.getProperty("user.home"),"Desktop", "modulo", "PROYECTOS JAVA", "archivosPdf", "listadoUsuarios.pdf");
				File pdfFile = ruta.toFile();
				Desktop.getDesktop().open(pdfFile);
				System.out.println("archivo creado correctamente");
			}
				break;
			case 5:{
				System.out.println("generando archivo TXT");
				ArrayList<Usuario> listadoCompletoActualizado2 = gestion.listadoCompletoActualizado();
				ArrayList<String> guardarNombreColumnas2 = gestion.guardarNombreColumnas();
				generarTxt = new GenerateTxt("listadoUsuarios.txt");
				generarTxt.createTxt();
				generarTxt.setTxt(listadoCompletoActualizado2, guardarNombreColumnas2);
				generarTxt.closeTxt();
				System.out.println("archivo creado correctamente");
			}
			break;
			case 6:{
				String ciudad = " ";
				System.out.println("generando Pdf....");
				System.out.println(" dime una ciudad para filtrar");
				ciudad= leer.next();
				ArrayList<Cliente> guardarClientePorCiudad = gestion.guardarClientePorCiudad(ciudad);
				ArrayList<String> guardarNombreColumnasClientes = gestion.guardarNombreColumnasClientes();
				generarPdfCliente = new GeneratePdfClientes("clientesPorCiudad.pdf");
				generarPdfCliente.openPdf();
				generarPdfCliente.setPdf(guardarClientePorCiudad, guardarNombreColumnasClientes);
				generarPdfCliente.closePdf();
				Path ruta = Paths.get(System.getProperty("user.home"),"Desktop", "modulo", "PROYECTOS JAVA", "archivosPdf", "clientesPorCiudad.pdf");
				File pdfFile = ruta.toFile();
				Desktop.getDesktop().open(pdfFile);
				System.out.println("archivo creado correctamente");	
			}
			break;
			case 7:{
				int validateCrearTablaCliente = 1;
				System.out.println("generando pdf.....");
				ArrayList<Cliente> archivoCompletoClienteActualizado = gestion.archivoCompletoClienteActualizado();
				ArrayList<String> guardarNombreColumnasClientes2 = gestion.guardarNombreColumnasClientes();
				generarCsv = new GenerateCsv("clientes.csv");
				generarCsv.createTxt();
				generarCsv.setTxt(archivoCompletoClienteActualizado, guardarNombreColumnasClientes2);
				generarCsv.closeTxt();
				System.out.println("archivo creado correctamente");
				System.out.println("quieres crear una nueva tabla con los clientes españoles? pulsa 1 para crearla, pulsa cualquier otro numero para salir");
				opcionCrearTablaClientes = leer.nextInt();
				if(opcionCrearTablaClientes==validateCrearTablaCliente) {
					leerCsv = new ReaderCsv("clientes.csv");
					leerCsv.createTxt();
					ArrayList<Cliente> clientesCompletos = leerCsv.setTxt();
					leerCsv.closeTxt();
					ArrayList<Cliente> extraerNacionalidad = gestion.extraerNacionalidad(clientesCompletos);
					boolean crearTablaClientesEspañoles = gestion.crearTablaClientesEspañoles();
					if(crearTablaClientesEspañoles==true) {
						System.out.println("tabla creada correctamente");
					}
					System.out.println("desea incluir los clientes en la tabla? para no duplicar registros pulse 1 para insertar, pulse otro numero para salir");
					opcionAnadirClientesEspanoles = leer.nextInt();
					if(opcionAnadirClientesEspanoles==1) {
						gestion.insertarClientes(extraerNacionalidad);
					}
					
					
				}
				
			}
			break;
			default:{
			}
				break;
			}
		}
		while(opcion!=salir);
		

	}
	public static void crearMenu() {
		System.out.println(" opciones :");
		System.out.println("1.crear un usuario");
		System.out.println("2. visualizar tablas");
		System.out.println("3. busqueda personalizada");
		System.out.println("4. crear un pdf con los usuarios");
		System.out.println("5. crear un txt con los usuarios");
		System.out.println("6. crear PDF de cliente de la ciudad que elijas");
		System.out.println("7. crear un csv con todos los clientes");
		System.out.println("8. Salir");
		System.out.println("escribe la opcion elegida :");
	}

}
