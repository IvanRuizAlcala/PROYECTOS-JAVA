import java.util.Random;
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		String[] jugadores = { "Stephen Curry", "Lebron James", "Damian Lillard", "James Harden", "Devin Booker",
                "Anthony Davis", "Kawhi Leonard", "Luka Doncic", "Kevin Durant", "Giannis Antetokounmpo" };
		String[] temporadas = { "2017/2018", "2018/2019", "2019/2020", "2020/2021" };
		Scanner leer = new Scanner(System.in);
		int jugadorSolicitado=0;
		int temporadaSolicitada=0;
		int horizontal=0;
		int vertical=0;
	double[][] mediaPuntosTemporada = new double[4][10];
    for (horizontal = 0; horizontal < mediaPuntosTemporada.length; horizontal++) {
        for (vertical = 0; vertical < mediaPuntosTemporada[horizontal].length; vertical++) {
            mediaPuntosTemporada[horizontal][vertical] = Math.random() * 30;
        }
    }
    	//ALGORITMO
    jugadorSolicitado=puntosJugador(jugadores);
    temporadaSolicitada=puntosPorTemporada(temporadas);
    System.out.println(mediaPuntosTemporada[jugadorSolicitado][temporadaSolicitada]);
}
	public static int puntosJugador(String [] jugadores) {
		Scanner leer = new Scanner(System.in);
		int contadorJugador=0;
		int posicionJugador=0;
		String jugadorSolicitado=" ";
		System.out.println(" dime el nombre de un jugador ");
		jugadorSolicitado = leer.next();
		for(contadorJugador=0;contadorJugador<jugadores.length;contadorJugador++) {
			if(jugadores[contadorJugador]==jugadorSolicitado) {
				posicionJugador=contadorJugador;
			}
		}
		
		return posicionJugador;
}
	public static int puntosPorTemporada(String []temporadas) {
		Scanner leer = new Scanner(System.in);
		int posicionTemporada=0;
		int contadorTemporada=0;
		String temporadaSolicitada=" ";
		System.out.println(" dime la temporada que deseas ver");
		temporadaSolicitada = leer.next();
		for(contadorTemporada=0;contadorTemporada<temporadas.length;contadorTemporada++) {
			if(temporadas[contadorTemporada]==temporadaSolicitada) {
					posicionTemporada=contadorTemporada;
				}
		}
		return posicionTemporada;
	}
	public static void puntosSanti (String[] jugadores, String[] temporadas) {
		
	}
}
