package model;

public class Usuario {
private int id;
private String nombreUsuario;
private String password;
private String tipoUsuario;
public Usuario(int id, String nombreUsuario, String password, String tipoUsuario) {
	this.id = id;
	this.nombreUsuario = nombreUsuario;
	this.password = password;
	this.tipoUsuario = tipoUsuario;
}

public Usuario(String nombreUsuario, String password, String tipoUsuario) {
	super();
	this.id = id;
	this.nombreUsuario = nombreUsuario;
	this.password = password;
	this.tipoUsuario = tipoUsuario;
	
}

public int getId() {
	return id;
}
public String getNombreUsuario() {
	return nombreUsuario;
}
public String getPassword() {
	return password;
}
public String getTipoUsuario() {
	return tipoUsuario;
}
@Override
public String toString() {
	return "Usuario [id=" + id + ", nombreUsuario=" + nombreUsuario + ", password=" + password + ", tipoUsuario="
			+ tipoUsuario + "]";
}

}
