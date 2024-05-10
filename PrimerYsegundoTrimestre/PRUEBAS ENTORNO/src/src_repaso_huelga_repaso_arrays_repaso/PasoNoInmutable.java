
public class PasoNoInmutable {
	public static void modificandoCadena(StringBuffer cadena) {
		cadena.append(".");
	}
	public static String modificandoCadenaDos(String cadena) {
		cadena=cadena+".";
		return cadena;
	}
}
