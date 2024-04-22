import java.util.Scanner;

public class EJERCICIO8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//datos
		int num1=0;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		do {
			System.out.println( " escribe un numero");
			num1 = leer.nextInt();
			
				if (num1 % 2 ==0) {
					System.out.println(" el numero es par");
				}
				else {
					System.out.println("el numero es impar");
				}
			}
		while(num1==0);
			
		}

	}
