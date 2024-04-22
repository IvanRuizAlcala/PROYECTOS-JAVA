package EJERCICIOS_MATRICES_1;

public class EJERCICIO5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int misnumeros [][]= {{2,4,5,6,7},{4,2,2,1,1},{5,6,7,8,8}};
		int valor=0;
		int vertical=0;
		int horizontal=0;
		int valorMayor=0;
		int valorAnterior=0;
		//ALGORITMO
		for(vertical=0;vertical<3;vertical++) {
			System.out.print(vertical + " ");
			for(horizontal=0;horizontal<5;horizontal++) {
				System.out.print(misnumeros[vertical][horizontal]+" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		for(vertical=0;vertical<3;vertical++) {
			for(horizontal=0;horizontal<5;horizontal++) {
				valor=valor+misnumeros[vertical][horizontal];
			}
			System.out.print(valor +" ");
			valor=0;
		
	}
		System.out.println();
		for(vertical=0;vertical<3;vertical++) {
			for(horizontal=0;horizontal<5;horizontal++) {
				valor=misnumeros[vertical][horizontal];
				if(valor>valorMayor) {
					valorMayor=valor;
				}
			}
	}
		System.out.println(valorMayor +" ");
	
	}
}
