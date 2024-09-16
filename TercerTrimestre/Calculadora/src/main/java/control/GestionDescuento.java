package control;

import java.util.ArrayList;

import model.data.Tarifa;

public class GestionDescuento {
ArrayList<Tarifa> tarifas3PBajas = new ArrayList<>();
ArrayList<Tarifa> tarifas2pBajas = new ArrayList<>();
ArrayList<Tarifa> lineasAdicionales  = new ArrayList<>();
ArrayList<Tarifa> lineasSoloMovil  = new ArrayList<>();
 public ArrayList<Tarifa> tarifas3PBajas() {
	 tarifas3PBajas.add(new Tarifa("FTTH 300MB + 19GB",34.90));
	 tarifas3PBajas.add(new Tarifa("FTTH 500 MB + 20GB",36.90));
	 tarifas3PBajas.add(new Tarifa("FTTH 500 MB + 48GB",39.90));
	 tarifas3PBajas.add(new Tarifa("FTTH 500 MB + 55GB",41.90));
	 tarifas3PBajas.add(new Tarifa("FTTH 500 MB + 105GB + 19GB",46.90));
	 tarifas3PBajas.add(new Tarifa("FTTH 500 MB + GB ILIMITADOS",49.90));
	 tarifas3PBajas.add(new Tarifa("FTTH 300MB + 19GB",34.90));
	 tarifas3PBajas.add(new Tarifa("FTTH 300MB + 19GB",34.90));
	 return tarifas3PBajas;
 }
 public ArrayList<Tarifa> tarifas2PBajas() {
	 tarifas2pBajas.add(new Tarifa("FTTH 500MB",31.99));
	 tarifas2pBajas.add(new Tarifa("FTTH 1g",41.99));
	 return tarifas2pBajas;
 }
 public ArrayList<Tarifa> lineasAdicionales() {
	 lineasAdicionales.add(new Tarifa("AD 0GB COMPARTIR",3));
	 lineasAdicionales.add(new Tarifa("10GB AD COMPARTIDA O SIN COMPARTIR",5));
	 lineasAdicionales.add(new Tarifa("15GB AD COMPARTIDA O SIN COMPARTIR",7));
	 lineasAdicionales.add(new Tarifa("30GB AD COMPARTIDA O SIN COMPARTIR",10));
	 lineasAdicionales.add(new Tarifa("50GB AD COMPARTIDA O SIN COMPARTIR",12));
	 lineasAdicionales.add(new Tarifa("GB Ilimitados AD ",12));
	 return lineasAdicionales;
 }
 public ArrayList<Tarifa> lineasSoloMovil() {
	 lineasSoloMovil.add(new Tarifa("MAS 5GB",6.90));
	 lineasSoloMovil.add(new Tarifa("MAS 20GB",9.90));
	 lineasSoloMovil.add(new Tarifa("MAS 30GB",14.90));
	 lineasSoloMovil.add(new Tarifa("MAS 70GB",19.90));
	 lineasSoloMovil.add(new Tarifa("MAS GB IL",29.90));
	 return lineasSoloMovil;
 }






	public void verificarTarifa(String tarifaElegidaPorUsuario) {
		
	}
}
