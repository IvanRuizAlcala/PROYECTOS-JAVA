
public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//datos
		char  contadorMayuscula = ' ';
		char contadorMinuscula = ' ';
		char Guardarletra =' ';
		int contador=0;
		int i =0;
		char letrasMayusculas[] = new char [26];
		char letrasMinusculas[] = new char [26];
		
		
		//algoritmo
		for(contadorMayuscula='A';contadorMayuscula<='Z';contadorMayuscula++) {
			letrasMayusculas[i]=contadorMayuscula;
			i++;
		}
		i=0;
			for(contadorMinuscula='a';contadorMinuscula<='z';contadorMinuscula++) {
				letrasMinusculas[i]=contadorMinuscula;
				i++;
			}	
			for(i=0;i<letrasMayusculas.length;i++) {
				System.out.println(letrasMayusculas[i]+"--------"+letrasMinusculas[i]);
			}
		}
	}


