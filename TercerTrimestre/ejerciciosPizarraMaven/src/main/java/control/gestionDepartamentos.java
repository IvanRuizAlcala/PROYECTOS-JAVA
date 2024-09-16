package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import model.ConectDB;
import model.gestionFicheroTXT;

public class gestionDepartamentos {
gestionFicheroTXT gestionFichero;

	
	public boolean crearTabla() throws SQLException {
		boolean control = false;
		String query = "create table if no exists pais( id int auto_increment primary key, nombre varchar(50)";
		PreparedStatement statement = ConectDB.getConexion().prepareStatement(query);
		int executeUpdate = statement.executeUpdate();
		if (executeUpdate!=0) {
			control=true;
		}
		return control;	
	}	
	public ArrayList<String> convertirDatos(String nombreArchivo) throws FileNotFoundException, IOException {
	ArrayList<String>totalDocumento = new ArrayList<>();
	gestionFichero = new gestionFicheroTXT(nombreArchivo);
	gestionFichero.abrirArchivo();
	ArrayList<String> insertarDatos = gestionFichero.insertarDatos();
	gestionFichero.cerrarArchivo();
	return totalDocumento;
	}
	public boolean insertarDatosEnBBD(ArrayList<String> paises) throws SQLException {
		boolean control = false;
		for (int i = 0; i < paises.size(); i++) {
		String query = "insert into pais(nombre) values(?)";
		PreparedStatement statement = ConectDB.getConexion().prepareStatement(query);
		statement.setString(1,paises.get(i));
		int executeUpdate = statement.executeUpdate();
		if(executeUpdate!=0) {
			control=true;
		}
		}
		return control;
	}
	public ArrayList<String> visualizarPaisesAcabadosEnA() throws SQLException {
		ArrayList<String> queryAux = new ArrayList<>();
		String queryVisualizarA = "select * from pais where nombre like 'A%' ";
		PreparedStatement statement = ConectDB.getConexion().prepareStatement(queryVisualizarA);
		ResultSet executeQuery = statement.executeQuery();
		while(executeQuery.next()) {
			String string = executeQuery.getString(2);
			queryAux.add(string);
		}
		return queryAux;
	}
	public ArrayList<String> visualizarPaisesEmpezadosEnL() throws SQLException {
		ArrayList<String>auxBusqueda = new ArrayList<>();
		String query = "select length(nombre) from pais where nombre like 'L%";
		PreparedStatement statement = ConectDB.getConexion().prepareStatement(query);
		ResultSet executeQuery = statement.executeQuery();
		while(executeQuery.next()) {
			auxBusqueda.add(executeQuery.getString(1));
		}
		return auxBusqueda;
	}
	public ArrayList<String> crearPdf() throws SQLException {
		ArrayList<String> aux = new ArrayList<>();
		String query = "select length(nombre) from pais having lenght(nombre)>10";
		PreparedStatement statement = ConectDB.getConexion().prepareStatement(query);
		ResultSet executeQuery = statement.executeQuery();
		while(executeQuery.next()) {
		aux.add(executeQuery.getString(2));
		}
		return aux;
	}
	
}
