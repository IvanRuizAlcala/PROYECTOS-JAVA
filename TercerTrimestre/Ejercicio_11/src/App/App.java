package App;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Class.GestionProductos;
import Class.Producto;
import Class.openBBDD;

public class App {

	public static void main(String[] args) {
		//DATOS
		String nombreArchivo="";
		String anio="";
		int unidadesMinimas=0;
		String codigo = "";
		Scanner leer = new Scanner(System.in); 
		int key = 0;
		boolean continuar = true;
		ArrayList<Integer> ventaDeProductosXanno = new ArrayList<>();
		ArrayList<String> cargarArchivo = new ArrayList<>();
		GestionProductos gestionarProductos = new GestionProductos();
		ArrayList<Producto> productos = new ArrayList<>();
		//Gestion
		System.out.println(" Bienvenido a Sr While Systems");
		System.out.println("Cargando Base de Datos");
		try {
		 cargarArchivo.addAll(cargarArchivo());
		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}
		System.out.println(" cargando productos en sistema");
		productos.addAll(gestionarProductos.crearProductos(cargarArchivo));
		System.out.println(" productos cargados correctamente");
		do {
			crearMenu();
			key = leer.nextInt();
			switch (key) {
			case 1: {
				System.out.println(" dime el codigo que quieres buscar");
				codigo = leer.next();
				Producto consultarProductoXcódigo = gestionarProductos.ConsultarProductoXcódigo(productos,codigo);
				System.out.println(" el producto es :");
				System.out.println(consultarProductoXcódigo);
			}
				
				break;
			case 2: {
				System.out.println(" dime las unidades minimas para los productos");
				unidadesMinimas = leer.nextInt();
				ArrayList<Producto> consultarProductos = gestionarProductos.consultarProductosDependiendoDeLasUnidades(productos, unidadesMinimas);
				System.out.println("los productos que cumplen los criterios son");
				for (Producto producto : consultarProductos) {
					System.out.println(producto);
				}
				}
					
					break;
			case 3: {
			System.out.println(" dime el año");
			anio = leer.next();
			ventaDeProductosXanno.addAll(gestionarProductos.ventaDeProductosXanno(productos, anio));
			System.out.println(" las unidades vendidas por año son");
			for (Integer integer : ventaDeProductosXanno) {
				System.out.print(integer + " ");
			}
				}
					break;
			case 4: {
				System.out.println(" dime el año");
				anio = leer.next();
				ventaDeProductosXanno.addAll(gestionarProductos.ventaDeProductosXanno(productos, anio));
				System.out.println(" dime el nombre del archivo donde se guardaran los datos(recuerda que debe finalizar en .txt");
				nombreArchivo = leer.next();
				try {
					gestionarProductos.guardarVentasEnFichero(ventaDeProductosXanno, nombreArchivo);
				} catch (IOException e) {
					e.getMessage();
				}
				System.out.println(" archivo creado correctamente");
					}
						break;

			default:
				continuar=false;
				break;
			}
		}
while(continuar);
		}
	
	public static void crearMenu() {
		System.out.println(" Menu : ");
		System.out.println("1. Consultar producto por Código ");
		System.out.println("2. Consultar productos segun las unidades que elijas que se han vendido a lo largo de los años");
		System.out.println("3. Consultar ventas de un año que elijas ");
		System.out.println("4. Generar un fichero TXT con las ventas de un año");
		System.out.print("elige una opcion :");
	}
	public static ArrayList<String> cargarArchivo() throws FileNotFoundException,IOException {
		ArrayList<String> totalProductos = new ArrayList<>();
		openBBDD abrirArchivo = new openBBDD("datosProductos.txt");
		
			abrirArchivo.abrirArchivo();
			System.out.println(" base de datos cargada");
			totalProductos.addAll(abrirArchivo.insertarDatos());
			System.out.println(" almacenando datos");
			System.out.print("0%");
			for (int i = 0; i < 8; i++) {
				System.out.print("---");
			}
			System.out.println("100%");
			abrirArchivo.cerrarArchivo();
			System.out.println(" Datos almacenados correctamente");
			return totalProductos;
	}
}
