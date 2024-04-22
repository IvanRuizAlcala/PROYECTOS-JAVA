package CAJEROBANCARIO;

import java.util.Scanner;

public class Cajero {
	static int saldoBanco=500;
	static String tarjetaBanco="16";
	static int saldocliente=300;
	static int saldoMaquina=1000;
	
	// El modulo raiz
	public static void main(String[] args) {

	}

	/**
	 * Obtener el identificador de la tarjeta
	 * 
	 * @return el numero identificador de la tarjeta
	 */
	public static String leerNumeroTarjeta() {
		// TODO
		return null;
	}

	/**
	 * Obtener el pin secreto de la tarjeta
	 * 
	 * @return el pin de la tarjeta
	 */
	public static String leerPinSecretoTarjeta() {
		// TODO
		return null;
	}

	/**
	 * Obtener el pin del usuario
	 * 
	 * @return el pin
	 */
	public static String leerPinUsuario() {
		// TODO
		return null;
	}

	/**
	 * Informa de que el pin del usuario no coincide con el secreto
	 */
	public static void informarErrorPinInvalido() {
		System.out.println("el pin no es correcto");
	}

	/**
	 * Comprueba si el pin del usuario es igual al pin secreto
	 * 
	 * @param pinSecreto leido de la tarjeta
	 * @param pinUsuario proporcionado por el usuario
	 * @return true si son iguales y false en caso contrario
	 */
	public static boolean comprobarPin(String pinSecreto, String pinUsuario) {
		boolean equals = pinSecreto.equals(pinUsuario);
		if(!equals) informarErrorPinInvalido();
		return equals;
	}

	/**
	 * Pide al usuario que introduzca una cantidad
	 * 
	 * @return el valor de la cantidad del importe
	 */
	public static int solicitarImporte() {
		// TODO
		return 0;
	}

	/**
	 * comprueba si hay dinero suficiente en la maquina
	 * 
	 * @param importe la cantidada retirar
	 * @return true si hay dinero suficiente y false en caso contrario
	 */
	public static boolean comprobarCajero(int importe) {
		//Saldo inventado, como si me lo dijera la maquina
		
		return importe<=saldoMaquina;
	}
	/**
	 * Comprueba si el saldo del cajero y del banco son 
	 * suficientes para satisfacer la operacion
	 * @param tarjeta identificador de la tarjeta
	 * @param importe la cantidad solicitada
	 * @return true si la operacion se puede realizar y false en caso contrario
	 */
	public static boolean comprobarImporte(String tarjeta,int importe) {
		boolean comprobarCajero = comprobarCajero(importe);
		boolean aprobacionBanco=false;
		if(comprobarCajero) {
			aprobacionBanco = comprobarBanco(tarjeta, importe);
		}
		return aprobacionBanco;
	}
	/**
	 * Informa al cajero y al banco de que la operacion se puede realizar
	 * para que estos resten el importe a los saldos 
	 * @param tarjeta donde se realiza la operacion 
	 * @param importe cantidad solicitada
	 */
	public static void finalizarOperacion(String tarjeta,int importe) {
		if(tarjetaBanco.equals(tarjeta)) {
			saldoBanco=saldoBanco-importe;
			saldoMaquina-=importe;
		}
	}
	/**
	 * realizamos la operacion de retirada de dinero
	 * @param tarjeta identificador para validar operacion
	 */
	public static void sacarDinero(String tarjeta) {
		int importe = solicitarImporte();
		boolean comprobarImporte = comprobarImporte(tarjeta, importe);
		if(comprobarImporte) {
			finalizarOperacion(tarjeta, importe);
		}
	}

	/**
	 * Comprueba si el saldo de la tarjeta es superior o igual
	 * al importe
	 * @param numeroTarjeta del usuario
	 * @param importe lo que se quiere retirar
	 * @return true si el saldo es sufiente y false en caso contrario
	 */
	public static boolean comprobarBanco(String numeroTarjeta, int importe) {
	
		return numeroTarjeta.equals(tarjetaBanco)&&importe<=saldoBanco;
	}
	/**
	 * solicitaremos al usuario que elija ver saldo o sacar dinero
	 * @param tarjetabanco datos bancarios del usuario
	 * return retorna a eleccion de una de las 2 opciones
	 */
	public static boolean solicitaroperacion(int tarjetabanco) {
		int pediroperacion=pedirtipoOperacion();
		if (pediroperacion==1) {
			
		}
		return false;
	}
	/**
	 * pediremos al usuario el tipo de operacion que quiere elegir
	 * @return retornara la opcion elegida por el usuario
	 */
	public static int pedirtipoOperacion() {
		Scanner leer=new Scanner(System.in);
		int opcionElegida = 0;
		System.out.println(" elige una opcion, pulsa 1 para ver saldo, 2 para sacar dinero ");
		opcionElegida= leer.nextInt();
		return opcionElegida;
	}
	/**
	 * opcion elegida por el usuario para ver el dinero que tiene en su cuenta
	 * @param tarjetabanco datos para identificar el usuario y la cuenta bancaria que tiene el usuario y la muestra en pantalla
	 * 
	 */
	public static void verSaldo(int tarjetabanco) {
		System.out.println(saldocliente);
	}
}
