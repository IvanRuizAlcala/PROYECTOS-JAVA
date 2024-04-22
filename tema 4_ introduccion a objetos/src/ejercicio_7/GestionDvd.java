package ejercicio_7;

import java.util.Random;
import java.util.Scanner;

public class GestionDvd {
	DvdCine mispeliculas [] = new DvdCine[25];
	

	public void llenarArray() {
		
		Random ramdon = new Random();
		String titulo [] = {"El Padrino" ,"Titanic" ,"El Señor de los Anillos: El retorno del Rey" ,"Pulp Fiction" ,"Forrest Gump" ,"Matrix", 
		"Star Wars: Episodio IV - Una nueva esperanza", "Jurassic Park", "E.T. el Extraterrestre", "El Rey León", "La Lista de Schindler", "Cadena Perpetua", 
		"El Resplandor", "Cazadores de Sueños", "Memento", "Gladiador", "Inception", "La La Land", "Ciudad de Dios", "El Gran Hotel Budapest", "El Club de la Pelea", 
		"El Silencio de los Corderos", "Interestelar", "La Forma del Agua", "El Gran Lebowski"};
		String director [] = {"Francis Ford Coppola","James Cameron","Peter Jackson","Quentin Tarantino","Robert Zemeckis","Lana y Lilly Wachowski",
				"George Lucas","Steven Spielberg","Steven Spielberg","Roger Allers y Rob Minkoff","Steven Spielberg","Frank Darabont","Stanley Kubrick","Darren Aronofsky",
				"Christopher Nolan","Ridley Scott","Christopher Nolan","Damien Chazelle","Fernando Meirelles","Wes Anderson","David Fincher","Jonathan Demme",
				"Christopher Nolan","Guillermo del Toro","Joel y Ethan Coen",};
		String productora [] = {"Paramount Pictures","20th Century Fox" ,"New Line Cinema" ,"Miramax Films" ,"Paramount Pictures" ,"Warner Bros.",
				"20th Century Fox","Universal Pictures","Universal Pictures","Walt Disney Pictures","Universal Pictures","Castle Rock Entertainment","Warner Bros.","Artisan Entertainment",
				"Newmarket Films","DreamWorks","Warner Bros.","Summit Entertainment","Miramax Films","Fox Searchlight Pictures","20th Century Fox","Orion Pictures","Paramount Pictures",
				"Fox Searchlight Pictures","Gramercy Pictures"};
		String actoresPrincipales [] = {"Marlon Brando","Leonardo DiCaprio","Elijah Wood","John Travolta","Tom Hanks","Keanu Reeves","Mark Hamill","Sam Neill",
				"Henry Thomas","Matthew Broderick","Liam Neeson","Tim Robbins","Jack Nicholson","Jared Leto","Guy Pearce","Russell Crowe","Leonardo DiCaprio",
				"Ryan Gosling",	"Alexandre Rodrigues","Ralph Fiennes","Edward Norton",
				"Jodie Foster","Matthew McConaughey","Sally Hawkins","Jeff Bridges"};
		String genero [] = {"Thriller","Romance/Drama","Fantasía/Aventura","Drama/Crimen","Comedia/Drama","Ciencia ficción/Acción","Ciencia ficción/Aventura",
				"Ciencia ficción/Aventura","Ciencia ficción/Fantasía","Animación/Aventura","Biografía/Drama","Drama","Terror/Drama","Drama","Drama",
				"Acción/Drama","Ciencia ficción/Acción","Musical/Drama","Crimen/Drama","Comedia/Drama","Drama","Crimen/Drama","Ciencia ficción/Aventura",
				"Drama/Fantasía","Comedia/Crimen"};
		String resumen [] = {"Crimen familiar en Nueva York.","Romance trágico en alta mar.","Épica batalla por Middle-earth.","Historias entrelazadas en Los Ángeles.",
				"Vida de un hombre excepcional.","Realidad virtual y rebelión.","Odisea espacial contra imperio.","Parque temático de dinosaurios.","Amistad con extraterrestre adorable.",
				"Aventuras animadas en África.","Rescate durante el Holocausto.","Amistad en prisión de por vida.","Aislamiento y locura en hotel.","Viaje oscuro hacia drogas.",
				"Memoria fragmentada, venganza trágica.","Gladiador busca justicia en Roma.","Sueños y realidades entrelazadas.","Romance en Los Ángeles musical.",
				"Violencia en favelas brasileñas.","Comedia de enredos hotelera.","Desafío existencial a sociedad.","Caza de asesino en serie.","Exploración cósmica desesperada.",
				"Romance entre mujer y anfibio.","Buscando identidad en Los Ángeles."};
		int contador=0;
		int aleatorio = 0;
		int tituloAleatorio=0;
		int directorAleatorio=0;
		int productoraAleatorio=0;
		int actoresPrincipalesAleatorio=0;
		int generoAleatorio=0;
		int resumenAleatorio;
		int duracionH;
		for(contador=0;contador<mispeliculas.length;contador++) {
			tituloAleatorio  = ramdon.nextInt(25);
			directorAleatorio = tituloAleatorio;
			productoraAleatorio  = tituloAleatorio;
			actoresPrincipalesAleatorio  = tituloAleatorio;
			generoAleatorio  = tituloAleatorio;
			resumenAleatorio = tituloAleatorio;
			duracionH = ramdon.nextInt(3);
		DvdCine pelicula= new DvdCine(titulo[tituloAleatorio],director[directorAleatorio],productora[productoraAleatorio], actoresPrincipales[actoresPrincipalesAleatorio],genero[generoAleatorio],resumen[resumenAleatorio],duracionH);
		mispeliculas[contador]=pelicula;
		}
	}
	
	public void mostrarPeliculas() {
		int contador=0;
		for(contador=0; contador<mispeliculas.length;contador++) {
			System.out.println(mispeliculas[contador]+" ");
}
	}
	public boolean esThriller() {
		int contador=0;
		int contador1=0;
		for(contador=0;contador<mispeliculas.length;contador++) {
			if (mispeliculas[contador].getGenero().equals("Thriller")) {
				return true;
				
			}
			
		}
		
		return false;
	}
	public boolean mismaProductora(String productoraElegidoPorUsuario) {
		int objetoElegido=0;
		Random aleatorio = new Random();
		Scanner leer = new Scanner(System.in);
		int contador=0;
		int contador1=0;
		objetoElegido  = aleatorio.nextInt(25);
		for(contador=0;contador<mispeliculas.length;contador++) {
			if (mispeliculas[objetoElegido].getProductora().equals(productoraElegidoPorUsuario)) {
			return true;
		
	}
}
		System.out.println(mispeliculas[objetoElegido].getProductora());
		return false;
	}
	public void MostrarPeliculasTituloYProductora() {
		int contador=0;
		for(contador=0; contador<mispeliculas.length;contador++) {
			System.out.println(mispeliculas[contador].getTitulo()+" "+mispeliculas[contador].getProductora());
	}
		
	}
	public void MostrarPeliculasMayorDuracion() {
		int contador=0;
		double contadorMayorDuracion=0;
		String retornarPelicula = null ;
		for(contador=0; contador<mispeliculas.length;contador++) {
			if(mispeliculas[contador].getDuracion()>=contadorMayorDuracion) {
				contadorMayorDuracion=mispeliculas[contador].getDuracion();
				retornarPelicula = mispeliculas[contador].getTitulo();
				System.out.println(retornarPelicula);
			}
			
	}
		
		
	}
	public void SolicitarGeneroyMostrarTituloPelicula() {
		int contador=0;
		Scanner leer = new Scanner(System.in);
		String GeneroSolicitado =" ";
		System.out.println(" dime un genero y te dire la pelicula o peliculas que tienen ese genero: ");
		GeneroSolicitado = leer.next();
		for(contador=0; contador<mispeliculas.length;contador++) {
			if(mispeliculas[contador].getGenero().equals(GeneroSolicitado)) {
				System.out.println(mispeliculas[contador]);
				
			}
		
	}
	}
	public void verArray() {
		int contadorVerArray=0;
		for(contadorVerArray=0; contadorVerArray<mispeliculas.length;contadorVerArray++) {
			System.out.println(misproductos[contadorVerArray]);
	}
}
