
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int numero = 0;
		int contador=0;
		//ALGORITMO
		for(contador=1000;contador>=0;contador=contador-100) {
				if(contador==500) {
				System.out.println("**"+contador+"**");
			}
			else {
				System.out.println(contador);
			}
		}
	}
}
