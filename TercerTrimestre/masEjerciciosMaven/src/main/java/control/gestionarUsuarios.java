package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.itextpdf.text.log.SysoCounter;

import model.data.ConectDB;

public class gestionarUsuarios {
	ConectDB conectar = new ConectDB();

public void crearTabla() throws SQLException {
	System.out.println("creando tabla");
	String queryCreateTable = "create table if not exists users( id int auto_increment primary key, username varchar(50) not null, password varchar(50) not null, userType varchar(50));";
PreparedStatement statement = conectar.getConexion().prepareStatement(queryCreateTable);
	statement.executeUpdate(queryCreateTable);
	System.out.println("tabla creada");
}
public void insertarUsuarios(Usuario usuario) throws SQLException {
	System.out.println("vamos a insertar usuarios");
	String queryInsertNameUser="insert into users (username,password,userType) value (?,?,?)"; 
	PreparedStatement statement2 = conectar.getConexion().prepareStatement(queryInsertNameUser);
		statement2.setString(1, usuario.getUserName());
		statement2.setString(2, usuario.getPassword());
		statement2.setString(3, usuario.getUserType());
		int executeUpdate = statement2.executeUpdate();
		if(executeUpdate!=0) {
			System.out.println("usuario insertado");
		}
}

public boolean buscarUsuario(String username,String password) throws SQLException {
	boolean control = false;
	String query = "select * from users where username=? and password=? and userType = ? ";
	PreparedStatement statement3 = conectar.getConexion().prepareStatement(query);
	statement3.setString(1, username);
	statement3.setString(2, password);
	statement3.setString(3, " usuario");
	ResultSet executeQuery = statement3.executeQuery();
	if(executeQuery.next()) {
		control=true;
	}
	return control;
}
public void mostrarTablas() throws SQLException {
	int contador=1;
	String query = "show tables";
	PreparedStatement statement = conectar.getConexion().prepareStatement(query);
	ResultSet executeQuery = statement.executeQuery();
	while(executeQuery.next()) {
		System.out.println(executeQuery.getString(1));
	}
}
}
