package control;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.data.ConectDB;

public class GestionarDepartamentos {
	GestionarDepartamentos gestion;
	ConectDB conectarDB = new ConectDB();

	public GestionarDepartamentos() {
		super();
		this.gestion = gestion;
	}
	public ArrayList<String> VisualizartablasDepartamentos() throws SQLException {
		ArrayList<String> nombreTablas = new ArrayList<>();
		Statement statement = conectarDB.getConexion().createStatement();
		ResultSet executeQuery = statement.executeQuery("show tables");
		ResultSetMetaData tables = executeQuery.getMetaData();
		while (executeQuery.next()) {
			for (int i = 1; i < tables.getColumnCount(); i++) {
				nombreTablas.add(tables.getTableName(3));
			}
		}
		return nombreTablas;
	}
}
