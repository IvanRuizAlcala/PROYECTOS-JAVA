
public class CalculadorSencilla {
	public static void main(String[] args) {
		int uno = pedirNumero();
		int dos = pedirNumero();
		boolean operacion = pedirOperacion();
		int resultado=0;
		if(operacion) {
			//suma
			 resultado = sumar(uno, dos);
		}else {
			//resta
			int otro=9;
			resultado=restar(uno, dos);
		}
		mostrarResultado(resultado);
	}

	public static int pedirNumero() {
		return 0;
	}

	public static boolean pedirOperacion() {
		return false;

	}

	public static int sumar(int valorUno, int numeroDos) {
		int suma = valorUno + numeroDos;
		return suma;

	}

	public static int restar(int valorUno, int numeroDos) {
		int suma = valorUno - numeroDos;
		return suma;

	}

	public static void mostrarResultado(int resultado) {

	}
}
