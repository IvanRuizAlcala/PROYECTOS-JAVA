import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ALGORITMO
		int num1=0;
		int num2=1;
		int suma=0;
		int numeroElegido=0;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		System.out.println(" elige un numero ");
		numeroElegido = leer.nextInt();
		System.out.print("0" + " ");
		while(suma!=numeroElegido) {
			num1=num2;
			num2=suma;
			suma=num1+num2;
			
			System.out.print(suma + " ");
		}
		

	}

}
