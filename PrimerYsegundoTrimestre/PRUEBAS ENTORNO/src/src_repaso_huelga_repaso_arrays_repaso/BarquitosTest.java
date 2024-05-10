import org.junit.jupiter.api.Test;

class BarquitosTest {

	@Test
	void testGenerarBarco() {
		int size = 5;
		boolean direccion = false;
		int[] inicial = { 2, 4 };
		int[] horizontal=new int[size];
		int[] vertical=new int[size];
		Barquitos.generarBarco(direccion, inicial, size, horizontal, vertical);
		/*
		 * * horizontal[2,2,2,2,2] vertical[4,5,6,7,8]
		 */
	
		}
	


