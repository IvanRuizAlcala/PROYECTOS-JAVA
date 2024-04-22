import java.util.Random;

public class SumarTresPares {
	public static void main(String[] args) {
		int cantidad = 3;
		int acumulado = 0;
		for (int i = 0; i < cantidad;) {
			int valor = generarNumeroAleatorio();
			boolean respuesta = comprobarPar(valor);
			if (respuesta) {
				i++;
				acumulado = sumarPar(acumulado, valor);
			}
		}
		System.out.println(acumulado);
	}

	/**
	 * 
	 * @param acumulado
	 * @param par
	 * @return
	 */
	public static int sumarPar(int acumulado, int par) {
		// TODO
		return 0;
	}

	/**
	 * comprueba si un valor es o no par
	 * 
	 * @param valor el numero a comprobar
	 * @return true si el valor es par o false en caso contario
	 */
	public static boolean comprobarPar(int valor) {
//		boolean b = valor % 2 == 0;
//		if (b == true)
//			return true;
//		else
//			return false;
		return valor % 2 == 0;
	}

	/**
	 * Genera un valor aleatorio
	 * @return un valor obtenido con aleatoriedad
	 */
	public static int generarNumeroAleatorio() {
		return Math.abs(new Random().nextInt(101));
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
