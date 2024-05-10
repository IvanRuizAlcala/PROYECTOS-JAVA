import org.junit.jupiter.api.Test;

class MultiplesSalidasTest {

	@Test
	void testValidandoPares() {
		int[] muestra= {4,5,7,9,6};
		boolean[] comprobacion=new boolean[muestra.length];
		boolean validandoPares = MultiplesSalidas.validandoPares(muestra, comprobacion);
	}

}
