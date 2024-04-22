
public class EjemplosFunciones {
public static void main(String[] args) {
	saludar();
	int valor=9;
	boolean respuesta =true;
	String nombre="Matias";
	saludarPersonalmente(nombre);
	int valorUno=7,valorDos=6;
	int resultado=sumar(valorUno, valorDos);
}
public static void saludar() {
	System.out.println("Hola mundo");
}
public static int sumar(int valorUno,int numeroDos) {
	int suma = valorUno+numeroDos;
	return suma;
	
}
public static void saludarPersonalmente(String apelativo) {
	boolean miscosas=false;
	System.out.println("Hola "+apelativo);
}
}
