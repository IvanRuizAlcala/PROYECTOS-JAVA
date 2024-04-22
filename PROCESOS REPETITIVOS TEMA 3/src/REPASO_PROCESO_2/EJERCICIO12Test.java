package REPASO_PROCESO_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EJERCICIO12Test {

	@Test
	boolean testCalcularnumeroprimo(int numerointroducido) {
		int contador=0;
		int divisor =0;
		int contadordivisor=0;
		for (contador=0;contador<=numerointroducido;contador++) {
			divisor=numerointroducido%contador;
			if (divisor==0) {
				contadordivisor++;
			}
		}
			if (contadordivisor==2) {
				return true;
			}
			return false;
	}

}
