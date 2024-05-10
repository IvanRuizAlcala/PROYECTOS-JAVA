import java.util.Scanner;

public class EJERCICIO10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int var1 =0;
		
		Scanner entrada=new Scanner(System.in);
		//ALGORITMO
		System.out.println(" Menú ");
		System.out.println(" 1. Abrir ");
		System.out.println(" 2. Cerrar ");
		System.out.println(" 3. Conectar ");
		System.out.println(" 4. Desconectar ");
		System.out.println(" 5. Fin ");
		System.out.println(" Elige una opcion: ");
		var1=entrada.nextInt();
		switch	(var1) {
		case 1 : System.out.println(" has elegido abrir");
		break ;
		case 2 : System.out.println(" has elegido Cerrar");
		break ;
		case 3 : System.out.println(" has elegido Conectar");
		break ;
		case 4 : System.out.println(" has elegido Desconectar");
		break ;
		case 5 : System.out.println(" has elegido Fin");
		break ;
		}
		
		
	}

}
