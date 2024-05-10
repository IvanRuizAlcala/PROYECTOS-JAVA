import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasoInmutableTest {

	@Test
	void testModificandoCadena() {
		// algunas tipos en java que
		// no pueden cambiar de valor
		// se llaman inmutables y tenemos que 
		//reconocerlos antes de usarlos
		String cartel = "me falta un punto";
		String cartelDos = "me falta un punto";
		String cartelTres =new String("me falta un punto");
		PasoInmutable.modificandoCadena(cartel);
		cartel=PasoInmutable.modificandoCadenaDos(cartel);
	}

}
