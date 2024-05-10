package Class;

import java.util.HashMap;
import java.util.Objects;

public class Estudiante extends MiPersona {
private int curso;
private HashMap <String , Integer> notas;


public Estudiante(int id, String nombre, int curso, HashMap<String, Integer> notas) {
	super(id, nombre);
	this.curso = curso;
	this.notas = notas;
}
/**
 * @return the curso
 */
public int getCurso() {
	return curso;
}
/**
 * @param curso the curso to set
 */
public void setCurso(int curso) {
	this.curso = curso;
}
/**
 * @return the notas
 */
public HashMap<String, Integer> getNotas() {
	return notas;
}
/**
 * @param notas the notas to set
 */
public void setNotas(HashMap<String, Integer> notas) {
	this.notas = notas;
}
@Override
public String toString() {
	return "Estudiante [ id=" + getId() +",nombre ="+ getNombre() + ", curso=" + curso + ", notas=" + notas + "]";
}
@Override
public int hashCode() {
	return Objects.hash(curso, notas);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Estudiante other = (Estudiante) obj;
	return curso == other.curso && Objects.equals(notas, other.notas);
}
public HashMap addNota(String asignatura, int nota) {
	notas.put(asignatura, nota);
	return notas;
	
}

}
