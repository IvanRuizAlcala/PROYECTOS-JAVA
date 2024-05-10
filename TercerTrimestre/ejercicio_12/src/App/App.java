package App;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import Class.GestionViajes;
import Class.OpenBBDD;
import Class.Viaje;

public class App {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//Datos
		OpenBBDD abrirViajesPaisUno = new OpenBBDD("paises1.txt");
		OpenBBDD abrirViajesPaisDos = new OpenBBDD("paises2.txt");
		GestionViajes gestionarViajesUno;
		GestionViajes gestionarViajesDos;
		//Programa
		System.out.println(" bienvenidos a Sr.Wile{Systems}");
		System.out.println(" vamos a Cargar los archivos");
		System.out.print("0% ");
		for (int i = 0; i < 10; i++) {
			System.out.print("---");
		}
		abrirViajesPaisUno.abrirArchivo();
		ArrayList<String> archivoCompletoPaisUno = abrirViajesPaisUno.insertarDatos();
		abrirViajesPaisUno.cerrarArchivo();
		abrirViajesPaisDos.abrirArchivo();
		ArrayList<String> archivoCompletoPaisDos = abrirViajesPaisDos.insertarDatos();
		abrirViajesPaisDos.cerrarArchivo();
		
		System.out.println(" 100% ");
		System.out.println(" archivos cargados");
		System.out.println(" vamos a gestionar los viajes 1");
		gestionarViajesUno = new GestionViajes(archivoCompletoPaisUno);
		ArrayList<Viaje> cargarViajesUno = gestionarViajesUno.cargarViajes();
		for (Viaje viaje : cargarViajesUno) {
			System.out.println(viaje);
		}
		System.out.println(" vamos a gestionar los viajes 2");
		gestionarViajesDos = new GestionViajes(archivoCompletoPaisDos);
		ArrayList<Viaje> cargarViajesDos = gestionarViajesDos.cargarViajes();
		for (Viaje viaje : cargarViajesDos) {
			System.out.println(viaje);
		}
	}

}
