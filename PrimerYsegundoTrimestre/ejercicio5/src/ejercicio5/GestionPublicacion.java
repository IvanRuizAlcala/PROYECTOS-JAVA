package ejercicio5;

import java.util.HashMap;
import java.util.Random;

public class GestionPublicacion {
	private HashMap<String, Publicacion> misPublicaciones = new HashMap();

	private static Publicacion generarPublicacion() {
		String[] tipo = { "Deportes", "Naturaleza", "Ajedrez",
				"Motor", "Caza", "Vuelo" };
				String[] periodicidad = { "Semanal", "Quincenal", "Mensual" };
				String[] editorial = { "Anaya", "SM", "ZRZ", "CAZA", "EDEBE",
				"SANTILLANA", "CALABAZA" };
				Random rnd = new Random();
				String titulo = "Tit" + rnd.nextInt(5000);
				return new Publicacion(titulo, tipo[rnd.nextInt(tipo.length)],
				editorial[rnd.nextInt(editorial.length)],
				periodicidad[rnd.nextInt(periodicidad.length)],
				rnd.nextInt(65000));
				}
	}

