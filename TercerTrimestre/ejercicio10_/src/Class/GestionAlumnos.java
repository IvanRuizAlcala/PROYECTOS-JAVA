package Class;

import java.util.ArrayList;
import java.util.HashMap;

public class GestionAlumnos {
	ArrayList<Alumno> AlumnosCompletos = new ArrayList<>();

	public ArrayList<Alumno> CrearAlumnos(ArrayList<String> archivoCompleto) {
		String[] fraseGuardada;
		int id;
		String nombre;

		for (int i = 0; i < archivoCompleto.size(); i++) {
			fraseGuardada = archivoCompleto.get(i).split(";");
			ArrayList<Double> auxNotas = new ArrayList<>();
			id = Integer.parseInt(fraseGuardada[0]);
			nombre = fraseGuardada[1];
			for (int j = 2; j < fraseGuardada.length; j++) {
				auxNotas.add(Double.parseDouble(fraseGuardada[j]));
			}
			Alumno alumno = new Alumno(id, nombre, auxNotas);
			AlumnosCompletos.add(alumno);

		}
		return AlumnosCompletos;
	}

	public  ArrayList<Double> sacarNotas(ArrayList<Alumno> misAlumnos, int id) {
		ArrayList<Double> notas = new ArrayList<>();
		for (int i = 0; i < misAlumnos.size(); i++) {
			if (misAlumnos.get(i).getIdAlumno() == id) {
				notas.addAll(misAlumnos.get(i).getNotas());
				
			}
		}
		if (notas == null) {
			System.out.println(" el id que intentas buscar no existe");
		}
		return notas;
	}

	public HashMap<Integer, Double> sacarNotaMedia(ArrayList<Alumno> misAlumnos, int id) {
		HashMap<Integer, Double> notaMedia = new HashMap<>();
		ArrayList<Double> aux = new ArrayList<>();
		int contador = 0;
		double suma = 0;
		double media;
		for (int i = 0; i < misAlumnos.size(); i++) {
			if (misAlumnos.get(i).getIdAlumno() == id) {
				aux.addAll(misAlumnos.get(i).getNotas());
				for (int j = 0; j < aux.size(); j++) {
					suma = aux.get(j) + suma;
					contador++;
				}
			}
			media = suma / contador;
			notaMedia.put(id, media);
		}
		if (notaMedia == null) {
			System.out.println(" el id que intentas buscar no existe");
		}
		return notaMedia;
	}

	public HashMap<Integer, Double> sacarNotaMasAlta(ArrayList<Alumno> misAlumnos, int id) {
		HashMap<Integer, Double> notaMasAlta = new HashMap<>();
		ArrayList<Double> aux2 = new ArrayList<>();
		double numeroMayor = 0;
		double media;
		for (int i = 0; i < misAlumnos.size(); i++) {
			if (misAlumnos.get(i).getIdAlumno() == id) {
				aux2.addAll(misAlumnos.get(i).getNotas());
				for (int j = 0; j < aux2.size(); j++) {
					if (aux2.get(j) > numeroMayor) {
						numeroMayor = aux2.get(j);
					}
				}
				notaMasAlta.put(id, numeroMayor);
			}
		}
		if (notaMasAlta == null) {
			System.out.println(" el id que intentas buscar no existe");
		}
		return notaMasAlta;
	}

	public ArrayList<Alumno> sacarNotaMediaTotalAlumnos(ArrayList<Alumno> misAlumnos) {
		Alumno auxAlum;
		ArrayList<Double> aux = new ArrayList<>();
		ArrayList<Alumno> mediaAlumnos = new ArrayList<>();
		int contador = 0;
		double suma = 0;
		double media;
		for (int i = 0; i < misAlumnos.size(); i++) {
				aux.addAll(misAlumnos.get(i).getNotas());
				for (int j = 0; j < aux.size(); j++) {
					suma = aux.get(j) + suma;
					contador++;
				}
				media = suma / contador;
				auxAlum = new Alumno(misAlumnos.get(i).getIdAlumno(), misAlumnos.get(i).getNombre(), media);
				mediaAlumnos.add(auxAlum);
				contador=0;
				suma=0;
			}
		
		return mediaAlumnos;
	}
}
