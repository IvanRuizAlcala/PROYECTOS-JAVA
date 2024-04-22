package PROCESO_REPETITIVO_3;

import java.util.Scanner;

public class EJERCICIO29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		
		int mes = 0 ;
			int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		int num5=0;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		do{
		System.out.println(" introduce un año ");
		num1=leer.nextInt();
		System.out.println(" introduce un mes ");
		mes=leer.nextInt();
		
				num2=num1 % 4;
				num3=num1 % 100;
				num4=num1 % 400;
				
				
					
	switch (mes) {
	case 1:
	System.out.println("el mes elegido es enero, el mes tiene 31 dias");
	break;
	case 2: 
		if (num2==0 || num3==1 || num4==0) {
			System.out.println("el mes elegido es febrero, el mes tiene 29 dias, ya que el año es bisiesto");
		}
			else {
				System.out.println("el mes elegido es febrero, el mes tiene 28 dias, ya que el año no es bisiesto");
			}
		
			break;	
	case 3:
		System.out.println("el mes elegido es marzo, el mes tiene 31 dias");
	break;
	case 4:
		System.out.println("el mes elegido es abril, el mes tiene 30 dias");
	break;
	case 5:
		System.out.println("el mes elegido es mayo, el mes tiene 31 dias");
		break;
	case 6:
		System.out.println("el mes elegido es junio, el mes tiene 30 dias");
		break;
	case 7:
		System.out.println("el mes elegido es julio, el mes tiene 31 dias");
		break;
	case 8:
		System.out.println("el mes elegido es agosto, el mes tiene 31 dias");
		break;
	case 9:
		System.out.println("el mes elegido es septiembre, el mes tiene 30 dias");
		break;
	case 10:
		System.out.println("el mes elegido es octubre, el mes tiene 31 dias");
		break;
	case 11:
		System.out.println("el mes elegido es noviembre, el mes tiene 30 dias");
		break;
	case 12:
		System.out.println("el mes elegido es diciembre, el mes tiene 31 dias");
		break;
		
		}
	
				System.out.println(" para repetir pulsa 1 ");
				num5=leer.nextInt();
				}
			
			
			
			while(num1!=0);
	}

}
