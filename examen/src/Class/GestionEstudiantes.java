package Class;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import Interface.interfaceGestionEstudiante;

public class GestionEstudiantes implements interfaceGestionEstudiante {
	int id = 1;
	Integer comprobarNota;
	Integer aprobado = 5;
	ArrayList<Estudiante> misEstudiantes = new ArrayList();
	String [] misAsignaturas = {"FOL", "BBDD", "EntornoD", "Programación", "LMSGI"};
	int [] estudianteAprobado = {6,8,9,6,10};

	@Override
	public void addEstudiante() {
		Random aleatorio = new Random();
		String nombre;
		int notas=0;
		int curso = 0;
		String asignatura =" ";
		Integer nota =0;
		Scanner leer = new Scanner(System.in);
		System.out.println("dime el curso del estudiante, 1 o 2");
		curso = leer.nextInt();
		if(curso==1 || curso ==2) {
		System.out.println(" dime el nombre");
		nombre = leer.next();
		asignatura = misAsignaturas[aleatorio.nextInt(5)];
		HashMap<String,Integer> misNotas = new HashMap();
		for (int i = 0; i < misAsignaturas.length; i++) {
			if(id==1) {
				nota = 8;
				asignatura = misAsignaturas[i];
				misNotas.put(asignatura, nota);
			}
			else {
			nota = aleatorio.nextInt(10);
			asignatura = misAsignaturas[i];
			misNotas.put(asignatura, nota);
			}
		}
		Estudiante estudiante = new Estudiante(id,nombre,curso,misNotas);
		misEstudiantes.add(estudiante);
		id++;
		}
		else {
			System.out.println(" el curso no es valido");
		}
	}

	@Override
	public Estudiante getEstudiante(int id) {
		Estudiante estudianteId;
		for (int i = 0; i < misEstudiantes.size(); i++) {
			estudianteId = misEstudiantes.get(i);
			if(estudianteId.getId()==id) {
				return estudianteId;
			}
		}
		
		return null;
	}

	@Override
	public HashMap<String,Integer> getNotasEstudiante(int id) {
		Estudiante estudianteNota;
		for (int i = 0; i < misEstudiantes.size(); i++) {
			estudianteNota = misEstudiantes.get(i);
			if(estudianteNota.getId()==id) {
				return estudianteNota.getNotas();
			}
		}
		return null;
	}

	@Override
	public HashMap getAprobados() {
		
		Estudiante estudianteNota;
		HashMap<Integer,String>listaAprobados = new HashMap();
		int contador = 0;
		for (int i = 0; i < misEstudiantes.size(); i++) {
			estudianteNota = misEstudiantes.get(i);
			for (int j = 0; j < misEstudiantes.size(); j++) {
				for (int j2 = 0; j2 < misAsignaturas.length; j2++) {
					comprobarNota = estudianteNota.getNotas().get(misAsignaturas[j2]);
					if(comprobarNota>=aprobado){
					contador++;
					} 	
				}
				if(contador==misAsignaturas.length) {
					listaAprobados.put(estudianteNota.getId(), estudianteNota.getNombre());
				}
			}
			
		}
		return listaAprobados;
	}

	@Override
	public ArrayList getAprobadosXAsignatura(String Asignatura) {
		HashMap<String,Integer> estudiantesXAsignatura = new HashMap();
		Estudiante estudianteAsignatura;
		ArrayList<Estudiante> listadoAprobados = new ArrayList();
		for (int i = 0; i < misEstudiantes.size(); i++) {
			estudianteAsignatura=misEstudiantes.get(i);
			estudiantesXAsignatura=estudianteAsignatura.getNotas();
			if(estudiantesXAsignatura.containsKey(Asignatura)&& estudiantesXAsignatura.get(misAsignaturas[i])>=aprobado){
				listadoAprobados.add(estudianteAsignatura);
			}
		}
		return listadoAprobados;
		
	}

	@Override
	public ArrayList visualizarEstudiantes() {
		for (Object object : misEstudiantes) {
			System.out.println(object);
		}
		return null;
	}
	@Override
	public void borrarEstudiante(int id) {
	
		
	}

}
