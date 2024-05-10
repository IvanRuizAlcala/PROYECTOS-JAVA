import java.util.Random;
import java.util.Scanner;

public class EJERCICIO_AHORCADO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int contadorTemas=0;
		String nombreUsuario = " ";
		Scanner leer = new Scanner(System.in);
		int temaElegido = 0;
		String menuTemas [] = {" Temas aleatorios" , " Animales", " Partes del cuerpo", " Nombre de paises"
				, " Comida", " Instrumentos musicales", " Trabajos" , " Deportes" , " Asignaturas escolares", 
				" Vehiculos", " El tiempo"};
		//ALGORITMO
		System.out.println(" bienvenido al juego del ahorcado, como te llamas ?");
		nombreUsuario = leer.next();
		System.out.println(" Temas Disponibles :");
		System.out.println(" hola, " + nombreUsuario + ", vamos a comenzar el juego! ");
		for(contadorTemas = 0; contadorTemas<menuTemas.length;contadorTemas++) {
			System.out.println("["+contadorTemas+"]" + menuTemas[contadorTemas]);
		}
		System.out.println(" elige un Tema");
		temaElegido = leer.nextInt();
		switch (temaElegido) {
		case 1 :
			juegoDelAhorcado(TemasAleatorio());
		}
		}
		public static void juegoDelAhorcado(String palabraElegida) {
			Scanner leer = new Scanner(System.in);
			boolean felicitarGanador;
			int contadorLetrasUsadas=0;
			int contadorIntentos=0;
			int numeroMaximoIntentos=10;
			int contador=0;
			int contadorVacias=0;
			char caracterDivido = ' ';
			char palabras [] = new char [palabraElegida.length()];
			char casillasVacias[]= new char [palabraElegida.length()];
			char letrasAcertadas[] = new char [palabraElegida.length()];
			char letrasUsadas[] = new char [numeroMaximoIntentos];
			char letraEscritaPorUsuario= ' ';
			int posicionElegidaPorUsuario=0;
			for(contador =0; contador<palabraElegida.length();contador++) {
				palabras[contador]=palabraElegida.charAt(0);
			}
			for(contadorVacias = 0; contadorVacias<casillasVacias.length;contadorVacias++) {
				casillasVacias[contadorVacias]= '_';
			}
			do {
			for(contadorVacias = 0; contadorVacias<casillasVacias.length;contadorVacias++) {
				System.out.println(casillasVacias[contadorVacias]);
				
			}
			
			System.out.println(" dime una letra y la poscicion");
			System.out.println("dime una letra");
			letraEscritaPorUsuario = leer.next().charAt(0);
			System.out.println("dime la posicion");
			posicionElegidaPorUsuario = leer.nextInt();
			if(palabras[posicionElegidaPorUsuario]==letraEscritaPorUsuario) {
				casillasVacias[posicionElegidaPorUsuario]=letraEscritaPorUsuario;
				letrasAcertadas[posicionElegidaPorUsuario]=letraEscritaPorUsuario;
			}
			else {
				System.out.println(" la letra que elegiste es incorrecta");
				letrasUsadas[contadorLetrasUsadas]=letraEscritaPorUsuario;
				contadorLetrasUsadas++;
			}
			contadorIntentos++;
			}
			while(contadorIntentos<=numeroMaximoIntentos);
		}
	
	public static String TemasAleatorio() {
		int contador=0;
		String [] temas = {"perro", " cabeza", "noruega ", " macarrones", "piano", "rotulista", "baloncesto", "informatica", " ford kuga", " soleado" };
		Random aleatorio = new Random();
		int opcionAleatoria= 0 ;
		String palabraSeleccionada = " ";
		opcionAleatoria = aleatorio.nextInt(10)+1;
		for(contador=0;contador<temas.length;contador++) {
			if(opcionAleatoria==contador) {
				palabraSeleccionada=temas[contador];
			}
		}
		return palabraSeleccionada;
	}

}
