package fr.francois.rollerCoaster;

import java.util.ArrayList;
import java.util.List;



public class Manege {
	private ArrayList<Visiteur> place = new ArrayList<Visiteur>();
	private int tours;
	private int prix;
	private int gain;
	private boolean estPleins = false;
	private boolean tourTermine = false;
	private ArrayList<Visiteur> fileDattente = new ArrayList<Visiteur>();
	
	public Manege() {
		this.tours = 1;
		this.prix = 1;
	}
	
	public int getTours() {
		return tours;
	}
	public void setTours(int tours) {
		this.tours = tours;
	}
	
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	public ArrayList<Visiteur> getFileDattente() {
		if(tours < 4) {
			return fileDattente;
		}else {
			return fileDattente;
		}
		
	}

	public void setFileDattente(ArrayList<Visiteur> fileDattente) {
		this.fileDattente = fileDattente;
	}

	public ArrayList<Visiteur> getPlace() {
		if(tours < 4) {
			return place;
		}else {
			return place;
		}
		
	}

	public void setPlace(ArrayList<Visiteur> place) {
		this.place = place;
	}
	/**
	 * Les passagers montent dans le manège
	 * @return boolean estPleins
	 * 
	 */
	public boolean monterDansLeManege() {
		if(tours < 4) {
			for(int i = 0; i < fileDattente.size(); i++) {
				
				getPlace().add(fileDattente.get(i));
				this.gain += getPrix();
				
			}
			fileDattente.removeAll(fileDattente);
			
			return estPleins = true;
		}else {
			return estPleins = false;
		}
		
	}
	/**
	 * Demarre le manege une fois 
	 * que les passagers sont montés 
	 * dans le manège
	 */
	public void demarrer() {
		
		if(tours < 4 && this.estPleins) {
			System.out.println("Tours "+tours);
			
				this.tours += 1;
				this.tourTermine = false;
				
				System.out.println("ça demarre!");
				
			
		}else {
			System.out.println("La journée est terminé");
		}
	}
	/**
	 * Les passagers descendent du manège
	 * @return list<Visiteur>
	 * 
	 */
	public List<Visiteur> descendreDuManege() {
		if(tours > 3) {
			
			return fileDattente;
		}else {
			if(!tourTermine) {
				for(int i = 3; i >= 0; i--) {
					fileDattente.add(place.get(i));
					place.remove(i);
				}
				
			}
			return fileDattente;
		}
		
	}
	
	/**
	 * Demarre l'application en injectant 
	 * des visiteur à la file d'attente
	 * 
	 */
	public List<Visiteur> aujouterVisiteur(Visiteur visiteur){
		if(tours < 4) {
			fileDattente.add(visiteur);
			
			return fileDattente;
		}else {
			return fileDattente;
		}
		
	}
	/**
	 * Procedure affichant les gains
	 */
	public void gain() {
		
		System.out.println(gain+" Euros");
	}
	

	@Override
	public String toString() {
		return "Manege [place=" + place + ", tours=" + tours + ", prix=" + prix + ", gain=" + gain + ", estPleins="
				+ estPleins + ", tourTermine=" + tourTermine + ", fileDattente=" + fileDattente;
	}
	
	
}
