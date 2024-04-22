import java.util.Random;
import java.util.Scanner;

public class EJERCICIOFUNCIONESSUMAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int aleatorio
		
		= 0;
		int valor = 0;
		boolean respuesta;
		int acumulado=0;
		int par=0;
		int cantidad = 3;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		aleatorio=generarnumeroaleatorio();
		respuesta=comprobarpar(valor);
		
		for ( int i = 0; i < cantidad; )
		if (respuesta) {
			acumulado=0;
				acumulado=sumarpar(acumulado,valor);
				System.out.println(acumulado);
		}
			
		
		
		
	}
/**
 * sumar dos numeros pares
 * @param acumulado primer numero par
 * @param par segundo numero par
 * @return devuelve el resultado de la suma de acumulado mas par
 */
	public static int sumarpar(int acumulado, int par) {
		// TODO Auto-generated method stub
		
		 return acumulado + par;
	}
/**
 * COMPREBA SI UN VALOR ES O NO PAR
 * @param valor numero a comprobar
 * @return true si el valor es par o false en caso contrario
 */
	public static boolean comprobarpar(int valor) {
		// TODO Auto-generated method stub
		return valor % 2 == 0;
	}
/**
 * genera un valor aleatorio
 * @return una valor obtenido con aleatoriedad
 */
	public static int generarnumeroaleatorio() {
		// TODO Auto-generated method stub
		return Math.abs(new Random().nextInt(100));

	}

}
