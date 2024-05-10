

import java.util.Scanner;

public class EjercicioFechaMal {
	// te dice tu edad en meses y annos
	// no son validos los annos anteriores a 1800
	//o mposteriores a 2022
	// no permite que el anno nacimiento sea posterior al actual
public static void main(String[] args) {
	Scanner leer=new Scanner(System.in);
	System.out.println("dime mes actual");
	int mesActual = leer.nextInt();
	System.out.println("dime a�o actual");
	int annoActual=leer.nextInt();
	System.out.println("dime mes nacimiento");
	int mesNacimiento=leer.nextInt();
	System.out.println("dime a�o nacimiento");
	int annoNacimiento=leer.nextInt();
	if(mesActual>=1&&mesActual<=12||mesNacimiento>1&&mesNacimiento<=12) {
		if(annoActual>1800&&annoNacimiento>1800||annoActual<2022&&annoNacimiento<=2022) {
			if(annoNacimiento<=annoActual) {
				int annosEdad=annoActual-annoNacimiento;
				int mesesEdad=mesActual-mesNacimiento;
				if(mesesEdad<0) {
					annosEdad--;
					mesesEdad=12-(-mesesEdad);
				}
				
				System.out.println("tienes "+annosEdad+" a�os y "+mesesEdad+" meses edad");
			}
		}
	}
}
}
