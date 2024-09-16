package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectDB {
private static Connection conexion = null;

public static Connection getConexion() throws SQLException {
	if(conexion==null) {
		conexion=DriverManager.getConnection("jdbc:mysql://localhost/classicmodels","root","");
	}
	return conexion;
}

public static void setConexion(Connection conexion) {
	ConectDB.conexion = conexion;
}

}