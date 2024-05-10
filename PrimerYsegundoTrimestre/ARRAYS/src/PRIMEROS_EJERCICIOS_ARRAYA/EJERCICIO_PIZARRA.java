package PRIMEROS_EJERCICIOS_ARRAYA;

public class EJERCICIO_PIZARRA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int i = 0;
		int valor=2;
		//ALGORITMO
		int[]misnumeros = new int [10];
		for (i = 0; i<misnumeros.length;i++) {
			misnumeros[i]=valor;
			valor=valor+2;
			
		}
	
		for (i = 0; i<misnumeros.length;i++) {	
			System.out.print(misnumeros[i] + " ");		
		}
		
}
}
