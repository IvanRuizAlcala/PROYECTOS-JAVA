package MAS_MATRICES;

public class EJERCICIO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int misnumeros[][]= {{1,2,3},{2,5,8},{3,8,10}};
		int horizontal=0;
		int vertical=0;
		int i=0;
		//ALGORITMO
		for(vertical=0;vertical<misnumeros.length;vertical++) {
			for ( horizontal=0;horizontal<=vertical;horizontal++) {
				System.out.print(misnumeros[vertical][horizontal]+" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		for(vertical=0;vertical<misnumeros.length;vertical++) {
			for ( horizontal=0;horizontal<3;horizontal++) {
				if(horizontal<=vertical) {
					System.out.print( " "+" ");	
				}
				else {
				System.out.print(misnumeros[vertical][horizontal]+" ");
				}
			}
			System.out.println(" ");
		}
	}

}
