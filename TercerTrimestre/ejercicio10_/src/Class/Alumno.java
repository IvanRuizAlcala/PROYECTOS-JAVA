package Class;

import java.io.Serializable;
import java.util.ArrayList;

public class Alumno implements Serializable {
	private int idAlumno;
	private String nombre;
	private ArrayList<Double> notas;
	private Double notaMedia;
	public Alumno(int idAlumno, String nombre, ArrayList<Double> auxNotas) {
		super();
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.notas = auxNotas;
	}
	public Alumno(int idAlumno, String nombre, Double notaMedia) {
		super();
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.notaMedia = notaMedia ;
	}
	
	/**
	 * @return the notaMedia
	 */
	public Double getNotaMedia() {
		return notaMedia;
	}
	/**
	 * @param notaMedia the notaMedia to set
	 */
	public void setNotaMedia(Double notaMedia) {
		this.notaMedia = notaMedia;
	}
	/**
	 * @return the idAlumno
	 */
	public int getIdAlumno() {
		return idAlumno;
	}

	/**
	 * @param idAlumno the idAlumno to set
	 */
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the notas
	 */
	public ArrayList<Double> getNotas() {
		return notas;
	}

	/**
	 * @param notas the notas to set
	 */
	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Alumno [idAlumno=" + idAlumno + ", nombre=" + nombre + ", notas=" + notas + ", notaMedia=" + notaMedia
				+ "]";
	}

}
