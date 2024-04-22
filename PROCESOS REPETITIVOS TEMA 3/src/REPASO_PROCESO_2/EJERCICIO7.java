package REPASO_PROCESO_2;

import java.util.Random;

public class EJERCICIO7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int numeroaleatorio=0;
		int i =0;
		//ALGORITMO
		for(i=1;i<=10;i++) {
			numeroaleatorio = numeroaleatorio(1,50);
			System.out.println(numeroaleatorio);
		}
	}
	public static int numeroaleatorio(int min,int max ) {
		Random aleatorio = new Random();
		return aleatorio.nextInt( max -  min + 1) +  min;
		
	}

}
