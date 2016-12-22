package ma.ensa.Observable;

import java.util.Observable;

public class Gps extends Observable {
	private int positionnement;
	private int precision;

	public int getPositionnement() {
		return positionnement;
	}

	public void setPositionnement(int positionnement) {
		this.positionnement = positionnement;
		this.notifierObservateurs();
	}

	public int getPrecision() {
		return precision;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
		this.notifierObservateurs();
	}
	
	public void notifierObservateurs(){
		setChanged();
		notifyObservers();
	}
}
