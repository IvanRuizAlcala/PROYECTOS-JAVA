package ejercicio10_2_1;

import java.sql.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class GestionNumeros implements interfazNumeros {
	int misNumeros [] ;
	
	public GestionNumeros(int[] misNumeros) {
		super();
		Random aleatorio = new Random();
		for (int i = 0; i < misNumeros.length; i++) {
			misNumeros[i]= aleatorio.nextInt(20)+1;
		}
	}

	@Override
	public void mostrarNumeros() {
		for (int i= 0; i < misNumeros.length; i++) {
			System.out.println(misNumeros[i]);
		}

	}

	@Override
	public void mostrarNumerosComoString() {
			System.out.println(Arrays.toString(misNumeros));

	}

	@Override
	public void multiplicarPor(int numero) {
		for (int i = 0; i < misNumeros.length; i++) {
			misNumeros[i]=misNumeros[i]*numero;
		}

	}

	@Override
	public int contarValoresMayoresQue(int numero) {
		int retorno=0;
		for (int i = 0; i < misNumeros.length; i++) {
			if(misNumeros[i]==numero) {
				retorno++;
			}
		}
		return retorno;
	}

	@Override
	public int contarValoresEntre(int numero1, int numero2) {
		int retorno=0;
		for (int i = 0; i < misNumeros.length; i++) {
			if(misNumeros[i]>=numero1&&misNumeros[i]<=numero2) {
				retorno++;
		}
		}
		return retorno;
	
	}
	@Override
	public int compararCon(int[] otroArray) {
		int suma=0;
		if(otroArray.length>misNumeros.length) {
			for (int i = 0; i < otroArray.length; i++) {
				suma=suma + otroArray[i];
			}
		}
		if(otroArray.length<=misNumeros.length) {
			for (int i = 0; i < otroArray.length; i++) {
				suma=suma + otroArray[i];
			}
		}
		return suma;
	}

	@Override
	public int[] getArray(int[] otroArray) {
		if(otroArray.length>=misNumeros.length) {
			return otroArray;
		}
		if(otroArray.length<misNumeros.length) {
		}
		return misNumeros;
	}

}
