package ma.ensa.Observateur;

import java.util.Observable;
import java.util.Observer;

import ma.ensa.Observable.Gps;

public class AfficheResume implements Observer {
	
	private Gps gps;
	
	public void setGps(Gps gps) {
		this.gps = gps;
	}

	public void affiche() {
		System.out.println("Affichage résumé : ");
		System.out.println(gps.getPositionnement() + " " + gps.getPrecision());
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Gps){
			// gps = (Gps) o.;
		}
	}

}
