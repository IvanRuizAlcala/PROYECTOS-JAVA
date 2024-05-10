package Class;

import java.time.LocalDate;
import java.util.Date;

public class Refrigerados extends Productos {
private int codigoOrganismoSupervisionAlimentaria;

public Refrigerados(int idProducto, String descripcion, LocalDate fechaDeCaducidad, int numeroDeLote,
		int codigoOrganismoSupervisionAlimentaria) {
	super(idProducto, descripcion, fechaDeCaducidad, numeroDeLote);
	this.codigoOrganismoSupervisionAlimentaria = codigoOrganismoSupervisionAlimentaria;
}

/**
 * @return the codigoOrganismoSupervisionAlimentaria
 */
public int getCodigoOrganismoSupervisionAlimentaria() {
	return codigoOrganismoSupervisionAlimentaria;
}

/**
 * @param codigoOrganismoSupervisionAlimentaria the codigoOrganismoSupervisionAlimentaria to set
 */
public void setCodigoOrganismoSupervisionAlimentaria(int codigoOrganismoSupervisionAlimentaria) {
	this.codigoOrganismoSupervisionAlimentaria = codigoOrganismoSupervisionAlimentaria;
}

@Override
public String toString() {
	return super.toString() + "Refrigerados [codigoOrganismoSupervisionAlimentaria=" + codigoOrganismoSupervisionAlimentaria + "]";
}

}
