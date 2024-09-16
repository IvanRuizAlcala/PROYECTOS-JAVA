package Class;

import java.util.ArrayList;
import java.util.Objects;

public class Definicion {
private ArrayList<String> definicion = new ArrayList<>();

public Definicion(ArrayList<String> definicion) {
	super();
	this.definicion = definicion;
}

public ArrayList<String> getDefinicion() {
	return definicion;
}

public void setDefinicion(ArrayList<String> definicion) {
	this.definicion = definicion;
}

@Override
public String toString() {
	return "Definicion [definicion=" + definicion + "]";
}
public void addDefinicion(String string) {
	definicion.add(string);
}

}
