package FUNCIONES;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumarTresParesTest {

	@Test
	void testSumarPar() {
		fail("Not yet implemented");
	}

	@Test
	void testComprobarPar() {
		boolean comprobarPar = SumarTresPares.comprobarPar(2);
		comprobarPar = SumarTresPares.comprobarPar(3);
	}

	@Test
	void testGenerarNumeroAleatorio() {
		int repeticiones=10;
		for (int i = 0; i < repeticiones; i++) {
			int numero = SumarTresPares.generarNumeroAleatorio();
			System.out.println(numero);
		}
	}

	
	
	
	
	
	
	
}
