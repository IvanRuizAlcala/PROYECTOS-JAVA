package Interface;

import java.util.ArrayList;
import java.util.HashMap;

import Class.Diccionario;


public interface interfazGestionarDicionario {
	/**
	 * crea un diccionario y lo añade a la lista de diccionarios
	 */
public void addDiccionario();
/**
 * añade terminos
 */
public void addTerminos(Diccionario diccionario);
/**
 * añadir significados a un termino que ya exista en el diccionario
 */
public void modificarSignificado(String terminos);
/**
 * mostrar los significados de un término
 * @param termino
 * @return
 */
public HashMap mostrarSignificadosPorTermino(String termino);
/**
 * elimina un si
 * @param termino
 */
public void eliminarSignificado(Diccionario diccionario);
void addTerminos(String idioma);

}
