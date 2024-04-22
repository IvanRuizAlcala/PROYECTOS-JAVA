package REPASO_PROCESO_2;

import java.util.Random;

public class EJERCICIO11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracteraleatorio = ' ';
		caracteraleatorio=(char) caracteraleatorio(65,94);
		System.out.println(caracteraleatorio);
		
	}
	public static int caracteraleatorio(int min, int max) {
		Random aleatorio = new Random();
		return aleatorio.nextInt( max -  min + 1) +  min;
}
}
