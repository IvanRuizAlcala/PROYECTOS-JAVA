package REPASO_PROCESO_2;

public class EJERCICIO3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DATOS
		int num1=0;
		int num2=0;
		int num3=0;
		int i=0;
		int acumulado=2;
		char estrella='*';
		//ALGORITMO
		for(num1=1;num1<=5;num1++) {
			num3= num3 + acumulado;
			acumulado=num3;
			num2=1;
			System.out.print(num1+"-->");
			for(i=num2;i<=num3;i++) {
				System.out.print(estrella);
				
			}
			System.out.println();
		}
	}

}
