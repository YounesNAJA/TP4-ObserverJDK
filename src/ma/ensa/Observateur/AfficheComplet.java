package ma.ensa.Observateur;

import java.util.Observable;
import java.util.Observer;

import ma.ensa.Observable.Gps;

public class AfficheComplet implements Observer {
	private Gps gps;
	
	public void setGps(Gps gps) {
		this.gps = gps;
	}
	
	public void affiche() {
		System.out.println("Affichage complet : ");
		System.out.println("Position : " + gps.getPositionnement());
		System.out.println("Precision : " + gps.getPrecision());
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Gps){
			Gps gps = (Gps) o;
		}
		
	}

}
