package CAJEROBANCARIO;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CajeroTest {

	@Test
	void testLeerNumeroTarjeta() {
		String leerNumeroTarjeta = Cajero.leerNumeroTarjeta();
	}

	@Test
	void testLeerPinSecretoTarjeta() {
		fail("Not yet implemented");
	}

	@Test
	void testLeerPinUsuario() {
		fail("Not yet implemented");
	}

	@Test
	void testInformarErrorPinInvalido() {
		fail("Not yet implemented");
	}

	@Test
	void testComprobarPin() {
		String secreto="1234",usuario="2345";
		System.out.println("probando pines diferentes");
		boolean comprobarPin = Cajero.comprobarPin(secreto, usuario);
		usuario="1234";
		System.out.println("probando pines iguales");
		comprobarPin = Cajero.comprobarPin(secreto, usuario);
	}

	@Test
	void testSolicitarImporte() {
		fail("Not yet implemented");
	}

	@Test
	void testComprobarCajero() {
		int cajero=1000;
		int valor=1000;
		boolean comprobarCajero = Cajero.comprobarCajero(valor++);
		comprobarCajero = Cajero.comprobarCajero(valor);
	}

	@Test
	void testComprobarBanco() {
		int saldo=500;
		int valor=500;
		String tarjeta="16";
		boolean comprobarBanco = Cajero.comprobarBanco(tarjeta, valor++);
		comprobarBanco = Cajero.comprobarBanco(tarjeta, valor);
	}

	@Test
	void testComprobarImporte() {
		int importe=500;
		String tarjeta="16";
		boolean comprobarImporte = Cajero.comprobarImporte(tarjeta, importe++);
		comprobarImporte = Cajero.comprobarImporte(tarjeta, importe++);
	}
	
	@Test
	void testfinalizarOperacion() {
		int importe=500;
		String tarjeta="16";
		Cajero.finalizarOperacion(tarjeta, importe);
		//saldo == 0
		int saldoBanco = Cajero.saldoBanco;
		//saldo == 500
		int saldoMaquina = Cajero.saldoMaquina;
	}
	@Test
	void testSacarDinero() {
		String tarjetaPrueba="16";
		Cajero.sacarDinero(tarjetaPrueba);
	}
}
