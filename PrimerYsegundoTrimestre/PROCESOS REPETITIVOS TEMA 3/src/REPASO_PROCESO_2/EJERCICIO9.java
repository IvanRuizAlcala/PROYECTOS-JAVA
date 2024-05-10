package REPASO_PROCESO_2;

import java.util.Scanner;

public class EJERCICIO9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		int num2=0;
		int resultadofactorial=0;
		Scanner leer= new Scanner(System.in);
		//ALGORITMO
		System.out.println(" introduce un numero ");
		num1=leer.nextInt();
		resultadofactorial=EJERCICIO9.valorfactorial(num1);
		System.out.println(" el factorial del numero es " + resultadofactorial);
		
		
	}
	public static int valorfactorial(int a) {
		int num1=0;
		int acumulado=1;
		int resultadofactorial=0;
		for (int i=a;i>0;i--) {
			acumulado=acumulado*i;
			resultadofactorial=acumulado;
			}
		return resultadofactorial;
		
	}

}
