package main;

import ma.ensa.Observable.Gps;
import ma.ensa.Observateur.AfficheComplet;
import ma.ensa.Observateur.AfficheResume;

public class Application {

	public static void main(String[] args) {
		Gps gps = new Gps();
		
		AfficheResume oR = new AfficheResume();
		oR.setGps(gps);
		
		AfficheComplet oC = new AfficheComplet();
		oC.setGps(gps);
		
		gps.ajouter(oR);
		gps.ajouter(oC);
		
		gps.setPositionnement(10);
		gps.setPrecision(20);

	}

}
