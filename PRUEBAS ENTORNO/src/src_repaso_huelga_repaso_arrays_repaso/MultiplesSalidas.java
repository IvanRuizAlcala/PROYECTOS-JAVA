
public class MultiplesSalidas {

	/**
	 * Detecta los valores pares de una lista
	 * @param valores el array de valores a comprobar
	 * @param pares donde anotamos si el numero de valores
	 * con el mismo indice es par o no
	 * @return true si habia algun valor par y false en caso 
	 * contario
	 */
	public static boolean validandoPares(int[] valores,boolean[] pares) {
		boolean retorno=false;
		for (int i = 0; i < pares.length; i++) {
			if(comprobarPar(valores[i])) {
				pares[i]=true;
				retorno=true;
			}
		}
		return retorno;
	}

	private static boolean comprobarPar(int valor) {
		return valor%2==0;
	}
}
