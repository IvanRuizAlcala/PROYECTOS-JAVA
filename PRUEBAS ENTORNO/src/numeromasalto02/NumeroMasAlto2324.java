package numeromasalto02;

import java.util.Random;
import java.util.Scanner;

public class NumeroMasAlto2324 {
public static void main(String[] args) {
	int minimoValorPosible=1;
	int maximoValorPosible=101;
	int secreto=generarAleatorio(minimoValorPosible,maximoValorPosible);
	int maximoFallosPermitidos=5;
	int fallosCometidos=0;
	int comparacion;
	boolean fallosMaximosAlcanzados=false;
	do {
		int valor=pedirNumero();
		comparacion=compararValores(valor,secreto);
		if(comparacion!=0) {
			fallosCometidos=incrementarFallos(fallosCometidos);
			fallosMaximosAlcanzados=comprobarLimiteFallos(fallosCometidos,maximoFallosPermitidos);
		}
	}while(comparacion!=0&&!fallosMaximosAlcanzados);
	if(comparacion==0) {
		felicitar();
	}else {
		lamentar();
	}
}

/**
 * Comunica al jugador que lamenta que haya perdido
 */
public static void lamentar() {
	// TODO Auto-generated method stub
	System.out.println(" has alcanzado el numero maximo de intentos");
}
/**
 * comunica al jugador que le felicita por ganar
 */
public static void felicitar() {
	// TODO Auto-generated method stub
	System.out.println(" enhorabuena, has ganado");
}
/**
 * Comprueba se se han alcanzado los maximos fallos permitidos
 * @param fallos los fallos que ha cometido actualmente
 * @param maximoFallosPermitidos la cantidad maxima de fallos permitida
 * @return true si la cantidad de fallos es menor que el maximoFallosPermitidos y false
 * en caso contrario
 */
public static boolean comprobarLimiteFallos(int fallos, int maximoFallosPermitidos) {
	// TODO Auto-generated method stub
	if (fallos<=maximoFallosPermitidos) {
		return true;
	}
	if (fallos>maximoFallosPermitidos)
		return false;
	return false;
}

/**
 * Incrementa en una unidad la cantidad de fallos actual
 * @param fallos cantidad de fallos
 * @return nueva cantidad de fallos
 */
public static int incrementarFallos(int fallos) {
	return fallos++;
	
}

/**
* Compara la diferencia entre valor y secreto
* @param valor primer numero a comparar
* @param secreto segundo numero a comparar
* @return 0 si son iguales, una cantidad positiva si valor>secreto
* o una cantidad negativa si secreto>valor
*/
//Si son iguales retorna 0 si valor>secreto retorna >0 si no <0
public static int compararValores(int valor, int secreto) {
	// TODO Auto-generated method stub
	if (valor==0) {
		return 0;
	}
	if (valor>secreto) {
		return 1;
	}
	if (valor<secreto) {
		return -1;
	}
	return secreto;
}

/**
 * genera un numero aleatorio 
 * @param min el numero mas bajo que puede salir
 * @param max el mayor numero que puede salir
 * @return un numero aleatorio entre min y max, max>=retorno>=min
 */
public static int generarAleatorio(int min, int max) {
	//TODO
	Random aleatorio = new Random();
	return aleatorio.nextInt(max - min + 1) + min;
	
	
}

/**
 * Solicita al jugador un valor
 * @return el valor entero solicitado al jugador
 */
public static int pedirNumero() {
	//TODO
	System.out.println("introduce un numero");
	Scanner leer = new Scanner(System.in);
	int valor = leer.nextInt();
	return valor;
}
}
