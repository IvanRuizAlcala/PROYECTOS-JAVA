package Class;

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

@Override
public String toString() {
	return super.toString() + "Congelados [temperaturaCongelaciónRecomendada=" + temperaturaCongelaciónRecomendada + "]";
}

}
