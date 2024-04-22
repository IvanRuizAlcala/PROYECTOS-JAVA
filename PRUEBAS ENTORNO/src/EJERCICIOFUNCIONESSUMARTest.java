import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EJERCICIOFUNCIONESSUMARTest {

	@Test
	void testSumarpar() {
		fail("Not yet implemented");
	}

	@Test
	void testComprobarpar() {
		boolean comprobarpar = EJERCICIOFUNCIONESSUMAR.comprobarpar(2);
		 comprobarpar = EJERCICIOFUNCIONESSUMAR.comprobarpar(3);
	}

	@Test
	void testGenerarnumeroaleatorio() {
		int repeticiones=10;
		for (int i=0; i < repeticiones;i++) {
		int numero = EJERCICIOFUNCIONESSUMAR.generarnumeroaleatorio();
		System.out.println(numero);
	}
	}
}
