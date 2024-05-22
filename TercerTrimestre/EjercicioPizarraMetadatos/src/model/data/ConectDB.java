package model.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectDB {
	private Connection conexion;

	public ConectDB() {
		super();
		this.conexion = conexion;
	}
	
	
public Connection getConexion() throws SQLException {
	if(conexion==null) {
		conexion=DriverManager.getConnection("jdbc:mysql://localhost/departamentos","root","");
	}
	return conexion;
	
	
}
public void setConexion(Connection conexion) {
	this.conexion = conexion;
}

}
