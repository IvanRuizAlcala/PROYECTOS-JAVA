package Class;

import java.util.HashMap;
import java.util.Objects;

public class Diccionario {
private String idioma;
private HashMap<String,Definicion> termino;
public Diccionario(String idioma, HashMap<String, Definicion> termino) {
	super();
	this.idioma = idioma;
	this.termino = termino;
}
public String getIdioma() {
	return idioma;
}
public void setIdioma(String idioma) {
	this.idioma = idioma;
}
public HashMap<String, Definicion> getTermino() {
	return termino;
}
public void setTermino(HashMap<String, Definicion> termino) {
	this.termino = termino;
}
@Override
public String toString() {
	return "Diccionario [idioma=" + idioma + ", termino=" + termino + "]";
}
@Override
public int hashCode() {
	return Objects.hash(idioma, termino);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Diccionario other = (Diccionario) obj;
	return Objects.equals(idioma, other.idioma) && Objects.equals(termino, other.termino);
}

}
