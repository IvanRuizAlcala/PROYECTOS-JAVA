package ejercicio_6;

import java.time.LocalDate;
import java.util.Date;

public class Frescos extends Productos{
private LocalDate fechaDeEnvasado;
private String paisOrigen;
public Frescos(int idProducto, String descripcion, LocalDate fechaDeCaducidad, int numeroDeLote, LocalDate fechaDeEnvasado,
		String paisOrigen) {
	super(idProducto, descripcion, fechaDeCaducidad, numeroDeLote);
	this.fechaDeEnvasado = fechaDeEnvasado;
	this.paisOrigen = paisOrigen;
}
/**
 * @return the fechaDeEnvasado
 */
public LocalDate getFechaDeEnvasado() {
	return fechaDeEnvasado;
}
/**
 * @param fechaDeEnvasado the fechaDeEnvasado to set
 */
public void setFechaDeEnvasado(LocalDate fechaDeEnvasado) {
	this.fechaDeEnvasado = fechaDeEnvasado;
}
/**
 * @return the paisOrigen
 */
public String getPaisOrigen() {
	return paisOrigen;
}
/**
 * @param paisOrigen the paisOrigen to set
 */
public void setPaisOrigen(String paisOrigen) {
	this.paisOrigen = paisOrigen;
}
@Override
public String toString() {
	return "Frescos [fechaDeEnvasado=" + fechaDeEnvasado + ", paisOrigen=" + paisOrigen + "]";
}
}
