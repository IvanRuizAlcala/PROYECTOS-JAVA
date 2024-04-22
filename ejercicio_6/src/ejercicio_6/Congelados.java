package ejercicio_6;

import java.time.LocalDate;
import java.util.Date;

public class Congelados extends Productos {
private int temperaturaCongelaciónRecomendada;

public Congelados(int idProducto, String descripcion, LocalDate fechaDeCaducidad, int numeroDeLote,
		int temperaturaCongelaciónRecomendada) {
	super(idProducto, descripcion, fechaDeCaducidad, numeroDeLote);
	this.temperaturaCongelaciónRecomendada = temperaturaCongelaciónRecomendada;
}

/**
 * @return the temperaturaCongelaciónRecomendada
 */
public int getTemperaturaCongelaciónRecomendada() {
	return temperaturaCongelaciónRecomendada;
}

/**
 * @param temperaturaCongelaciónRecomendada the temperaturaCongelaciónRecomendada to set
 */
public void setTemperaturaCongelaciónRecomendada(int temperaturaCongelaciónRecomendada) {
	this.temperaturaCongelaciónRecomendada = temperaturaCongelaciónRecomendada;
}

public void mostrarProducto() {
	System.out.println("temperatura de congelacion recomendada :"+getTemperaturaCongelaciónRecomendada()+ " descripcion :" + getDescripcion() + 
			" idProducto :"+ getIdProducto() + " Numero de lote : " + getNumeroDeLote()+ " fecha de caducidad : " + getFechaDeCaducidad());
}
}
