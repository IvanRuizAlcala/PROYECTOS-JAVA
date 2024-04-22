package src_OCA;

import java.util.Random;

public class OCa {

	public static void main(String[] args) {
		int posicion[] = { 0, 0 };
		int castigo[] = { 0, 0 };
		int tirada = 0;
		int turno = 0;
		int antiguaPosicion = 0;
		do {
			boolean castigado = comprobarCastigado(castigo[turno]);
			if (!castigado) {
				tirada = tirarDados();
				posicion[turno] = moverFicha(posicion[turno], tirada);
			}
			antiguaPosicion = posicion[turno];
			posicion[turno] = comprobarPosicion(posicion[turno]);
			if (antiguaPosicion == posicion[turno]) {
				castigo[turno] = comprobarCastigo(posicion[turno]);
			}
			boolean cambioTurno = comprobarCambioTurno(antiguaPosicion, posicion[turno]);
			if (cambioTurno) {
				turno = cambiarTurno(turno);
			}
		} while (true);
	}

	/**
	 * comprueba si uno de los jugadores esta en el pozo
	 * y si es asi incrementa su castigo una tirada
	 * Si ambos estan el pozo, se ponen a cero los castigos
	 * del jugador que estaba antes en el pozo
	 * @param posicion la posicion de los jugadore
	 * @param castigo las penalizaciones de los jugadores
	 */
	public static void comprobarPozo(int[] posicion, int[] castigo) {
		// TODO
	}

	/**
	 * establece el turno del siguiente jugador
	 * 
	 * @param turno el actual
	 * @return el turno del siguiente jugador
	 */
	public static int cambiarTurno(int turno) {
		if (turno == 0)
			return 1;
		return 0;
	}

	/**
	 * No cambia el turno si el jugador actual ha caido en oca o puente
	 * 
	 * @param posicionAntigua donde estaba el jugador antes de la tirada
	 * @param posicionActual  despues de la tirada
	 * @return true si hay cambio de turno y false en caso contrario
	 */
	public static boolean comprobarCambioTurno(int posicionAntigua, int posicionActual) {
		// TODO
		return false;
	}

	/**
	 * comprobar si la posicion coincide con una casilla de pozo o posada
	 * 
	 * @param posicion actual
	 * @return csatigo proporcional a la casilla especial
	 */
	public static int comprobarCastigo(int posicion) {
		// TODO
		return -1;
	}

	/**
	 * comprobar si la posicion coincide con una casilla de oca o puente
	 * 
	 * @param b actual
	 * @return nueva posicion, diferente a la de entrada si hemos caido en una
	 *         casilla antes descrita
	 */
	public static int comprobarPosicion(boolean b) {
		// TODO
		int oca [] = new int [] {5,9,14,18,23,27,32,36,41,45,50,54,59};
		int comprobarOca;
		int puente[] = new int [] {6,12};
		int comprobarPuente=0;
		for (int i=0;i<oca.length;i++) {
			comprobarOca=oca[i];
			if(b==comprobarOca) {
				b=oca[i+1];
			}
		}
		for (int i=0;i<puente.length;i++) {
			comprobarOca=oca[i];
			if(b==comprobarOca) {
				b=oca[i+1];
		
		
		return -1;
	}

	/**
	 * Suma la tirada a la posicion
	 * 
	 * @param posicion valor actual
	 * @param tirada   valor de tirada
	 * @return la suma de ambas
	 */
	public static int moverFicha(int posicion, int tirada) {
		// TODO
		int moverFicha=posicion+tirada;
		
		return moverFicha;
	}

	/**
	 * entrega un valor entre 1 y 12
	 * 
	 * @return el valor aleatorio
	 */
	public static int tirarDados() {
		// TODO
	
		int tirada=0;
		Random aleatorio = new Random();
		tirada=aleatorio.nextInt(12)+1;
		
		return tirada;
	}

	/**
	 * comprueba si el jugador actual esta castigado si lo esta le quita un turno de
	 * castigo
	 * 
	 * @param castigo turnos de castigo
	 * @return true si tiene turnos de castigo pendientes
	 */
	public static boolean comprobarCastigado(int castigo) {
		// TODO Auto-generated method stub
		return false;
	}

	public static int comprobarPosicion(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
