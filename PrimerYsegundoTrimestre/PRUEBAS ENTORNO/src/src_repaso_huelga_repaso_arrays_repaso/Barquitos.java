
public class Barquitos {
	/**
	 * genera las posiciones que ocupa un barco
	 * 
	 * @param size       tamano del barco a crear
	 * @param direccion  direccion del barco, true es vertical y false horizontal
	 * @param inicial    posicion inicial de la primera casilla,
	 *  las siguientes avanzan hacia abajo o hacia la derecha
	 * @param horizontal array con las posiciones horizontales(x) del barco
	 * @param vertical   array con las posiciones vericales(x) del barco
	 */
	public static void generarBarco(boolean direccion, 
			int[] inicial,int size,
			int[] horizontal, int[] vertical) {
		if(direccion==false) {
			int i=0;
			horizontal[i]=inicial[0];
			for (int j = 0; j < vertical.length; j++) {
				int valor;
				vertical[0]=inicial[0];

			}
		}
			else {
				int i;
				vertical[i]=inicial[0];
				for (int j = 0; j < vertical.length; j++) {
					int valor;
					vertical[0]=inicial[0];
			}

	}
}
