package src_OCA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OCaTest {

	@Test
	void testCambiarTurno() {
		int cambiarTurno = OCa.cambiarTurno(0);
		cambiarTurno = OCa.cambiarTurno(1);
	}

	@Test
	void testComprobarPozo() {
		// nadie castigado
		int[] posiciones = { 3, 6 };
		int[] castigado = { 0, 0 };
		OCa.comprobarPozo(posiciones, castigado);
		// castigado debe valer {0,0}
		// el primero castigado
		posiciones = new int[] { 31, 26 };
		castigado = new int[] { 1, 0 };
		OCa.comprobarPozo(posiciones, castigado);
		// castigado debe valer {2,0}
		// el segundo castigado
		posiciones = new int[] { 26, 31 };
		castigado = new int[] { 0, 1 };
		OCa.comprobarPozo(posiciones, castigado);
		// castigado debe valer {0,2}
		// el primero castigado el segundo le rescata
		posiciones = new int[] { 31, 31 };
		castigado = new int[] { 1, 0};
		OCa.comprobarPozo(posiciones, castigado);
		// castigado debe valer {0,2}
		// el primero castigado el segundo le rescata
		posiciones = new int[] { 31, 31 };
		castigado = new int[] { 0, 1};
		OCa.comprobarPozo(posiciones, castigado);
		// castigado debe valer {2,0}
	}

	@Test
	void testComprobarCambioTurno() {
		fail("Not yet implemented");
	}

	@Test
	void testComprobarCastigo() {
		fail("Not yet implemented");
	}

	@Test
	void testComprobarPosicion() {
		int posicion = 0;
		int nuevaPosicion = 0;
		int comprobarPosicion = OCa.comprobarPosicion(posicion=nuevaPosicion);
		comprobarPosicion = OCa.comprobarPosicion(posicion!=nuevaPosicion);
		
	}

	@Test
	void testMoverFicha() {
		fail("Not yet implemented");
	}

	@Test
	void testTirarDados() {
		fail("Not yet implemented");
	}

	@Test
	void testComprobarCastigado() {
		boolean comprobarCastigado = OCa.comprobarCastigado(1);
		 comprobarCastigado = OCa.comprobarCastigado(0);
	}

}
