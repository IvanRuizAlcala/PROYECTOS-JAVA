package ejercicio_7;

import java.util.Scanner;

import Ejercicio_10.Menu1;

public class App_ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int finalizarMetodo=0;
		GestionDvd gestionPeliculas = new GestionDvd();
		
		Scanner leer = new Scanner(System.in);
		String productoraElegidoPorUsuario;
		gestionPeliculas.llenarArray();
		gestionPeliculas.mostrarPeliculas();
		String menuOpciones [] = { "1 - mostrar peliculas por titulo y productora","2 - Mostrar la pelicula con mayor duracion",
				"3 - Mostrar titulo pelicula por genero ","4 - finalizar programa"};
		Menu1 gestionarMenu = new Menu1(menuOpciones);
		
	do {
		String opcionElegidaUsuario = gestionarMenu.mostrarMenu();
		switch (opcionElegidaUsuario) {
		case "1" :{
			gestionPeliculas.MostrarPeliculasTituloYProductora();
		}
			break;
		case "2": {

			gestionPeliculas.MostrarPeliculasMayorDuracion();
		}
			break;
		case "3":{
			
			gestionPeliculas.SolicitarGeneroyMostrarTituloPelicula();
		}
		break;
		
		case "4": {
			System.out.println("has finalizado");
		}
		
		}
	System.out.println(" quieres repetir la eleccion pulsa 1, si quieres salir pulsa 0?");
	finalizarMetodo= leer.nextInt();
	
	}
	while(finalizarMetodo!=0);
}
}
