package Interface;
import java.util.ArrayList;
import java.util.HashMap;

import Class.Estudiante;
public interface interfaceGestionEstudiante {
	
	/**
	 * Recibe un estudiante y lo añade a la coleccion
	 */
	public void addEstudiante();
	/**
	 * @param  Recibe un id
	 * @return devuelve el estudiante con
				esa id o null si no lo encuentra
	 */
	public Estudiante getEstudiante(int id);
	/**
	 * 
	 * @param Recibe un id de estudiante 
	 * @return devuelve sus notas
	 */
	public HashMap<String, Integer> getNotasEstudiante(int id);
	/**
	 * 	El hashMap tendrá el id y nombre del estudiante
	 * @return Devuelve (retorna) un hashMap con los
			estudiantes que tienen todas las asignaturas aprobadas.
	 */
	public HashMap getAprobados();
	/**
	 * Devuelve (retorna) un listado
		(ArrayList) de los nombres de los alumnos aprobados en
			una asignatura que se pasará como parámetro
	 * @param Asignatura
	 * @return (ArrayList) de los nombres de los alumnos aprobados
	 */
	public ArrayList getAprobadosXAsignatura(String Asignatura);
	/**
	 * 
	 * @param array de estudiantes
	 * @return retorna el arraylist para visualizarlo en pantalla
	 */
	public ArrayList visualizarEstudiantes();
	/**
	 * borra un estudiante
	 */
	public void borrarEstudiante(int id);
	
	
	
}
