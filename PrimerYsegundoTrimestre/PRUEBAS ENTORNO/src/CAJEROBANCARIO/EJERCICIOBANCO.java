package CAJEROBANCARIO;

import java.util.Scanner;

import javax.swing.Spring;

public class EJERCICIOBANCO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
/**
 * 
 * @param numerodelatarjeta leer numero de la tarjeta del usuario
 * @return retorna el numero de la tarjeta del usuario
 */
public static String introducirtarjeta(String numerodelatarjeta) {
		//TODO
		return null; 
}

/**
 * @parametro pinsecreto leemos el numero pin secreto de la tarjeta
 * @return  se retorna el numero pin de la tarjeta
 */

public static String leerpingsecreto(String pinsecreto) {
		//TODO
	return null; 
}

/**
 * 
 * @param pinusuario lectura del numero pin que introduce el usuario
 * @return se retorna el numero pin de la tarjeta introducido por el usuario
 */
public static String leerpinusuario(String pinusuario) {
		//TODO
	return null;
}

/**
 * 
 * @param pinusuario numero de pin introducido por el usuario.
 * @param pinsecreto numero pin secreto asociado a la tarjeta.
 * @return si son iguales retorna true, si no son iguales retorna false.
 */
public static boolean comprobarpin(String pinusuario,String pinsecreto) {
		//TODO
	return false;
}

/**
 * una vez comprobado el pin, en caso de ser incorrecto mostraremos un error
 * @param comprobarpin entrada de la funcion comprobarpin en caso false
 * @return retorno de mensaje informando del error al usuario
 */
public static String informarerror(String comprobarpin) {
return null;	
}
/**
 * solicitar operación solicita al usuario que establezca la operación que quiere realizar
 * @param numerodetarjeta entrada de datos para la opcion elegida
 * @param tipodeoperacion, tipo de operacion elegida por el usuario, sacar dinero o ver saldo
 */

public static  void solicitaroperacion(int numerodetarjeta, boolean tipodeoperacion) {
	
}
/**
 * solicita al usuario que tipo de eleccion, ver saldo o sacar dinero, quiere elegir
 * @return retornamos si quiere ver el saldo utilizamos true, si quiere sacar dinero utilizamos false
 */
public static boolean pedirtipodeoperacion() {
	return false;
}
/**
 * mostrara el saldo al usuario
 * @param numerodetarjeta, tiene los datos de la cuenta y el saldo del usuario
 */
public static void versaldo(String numerodetarjeta) {
	
}
/**
 * solicitamos al usuario el importe que quiere recoger
 * @return se retorna el importe solicitado por el usuario
 */
public static int solicitarimporte() {
	//TODO
	return 0;
}
/**
 * entra un importe solicitado por el usario, el numero de cuenta para los datos para comprobar si
 * el cliente tiene suficiente dinero en su cuenta bancaria
 * @param importe importe solicitado por el usuario
 * @param numerodetarjeta datos de su cuenta para saber el saldo que tiene
 * @return si tiene suficiente dinero para sacar lo solicitado sera true, sino sera false.
 */
public static boolean comprobarimporte(int importe, String numerodetarjeta) {
		//TODO
	return false;
}
/**
 * se comprueba si el cajero tiene disponible el dinero solicitado por el usuario
 * @param importe, importe solicitado por el usuario
 * @return respuesta si el cajero tiene suficiente efectivo sera true, sino sera false
 */
public static boolean comprobarcajero(int importe) {
	//TODO
	return false;
}
/**
 * se comprueba que el importe solicitado por el cliente
 * @param importe
 * @param numerodetarjeta
 * @return
 */
public static boolean comprobarbanco(int importe, String numerodetarjeta) {
	return false;
}

}







