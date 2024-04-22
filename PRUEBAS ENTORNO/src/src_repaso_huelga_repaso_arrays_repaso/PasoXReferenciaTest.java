import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasoXReferenciaTest {

	@Test
	void testHazAlgo() {
		int referencia[] = { 0, 1, 2 }, 
				referenciaCero = 5;
		int[] referenciaDos = { 0, 1, 2 }, referenciaTres = { 0, 1, 2 };
		PasoXReferencia.hazAlgo(referenciaDos);
	}

}
