import org.junit.jupiter.api.Test;

class PasoNoInmutableTest {
	
	@Test
	void testModificandoCadena() {
		StringBuffer cadena=new StringBuffer("me falta un punto");
		PasoNoInmutable.modificandoCadena(cadena);
		String string = cadena.toString();
		System.out.println(cadena);
	}

}
