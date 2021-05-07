package fr.francois.rollerCoaster;


public class Main {

	public static void main(String[] args) {
		Visiteur vis1 = new Visiteur(1);
		Visiteur vis2 = new Visiteur(2);
		Visiteur vis3 = new Visiteur(3);
		Visiteur vis4 = new Visiteur(4);
		
		Manege manege = new Manege();
		
		manege.aujouterVisiteur(vis1);
		manege.aujouterVisiteur(vis2);
		manege.aujouterVisiteur(vis3);
		manege.aujouterVisiteur(vis4);
		
		System.out.println("File d'attente avant de monter dans le manège");
		System.out.println(manege.getFileDattente());
		
		manege.monterDansLeManege();
		
		System.out.println("File d'attente après être monter dans le manège");
		System.out.println(manege.getFileDattente() +" file");
		System.out.println("Etat des places du manège");
		System.out.println(manege.getPlace()+" place");
		
		manege.demarrer();
		System.out.println("On descend!");
		manege.descendreDuManege();
		System.out.println("Etat des places du manège");
		System.out.println(manege.getPlace()+" place");
		System.out.println("File d'attente après descendu du manège");
		System.out.println(manege.getFileDattente() +" file");
		manege.gain();
		
		System.out.println("File d'attente avant de monter dans le manège");
		System.out.println(manege.getFileDattente());
		
		manege.monterDansLeManege();
		
		System.out.println("File d'attente après être monter dans le manège");
		System.out.println(manege.getFileDattente() +" file");
		System.out.println("Etat des places du manège");
		System.out.println(manege.getPlace()+" place");
		
		manege.demarrer();
		System.out.println("On descend!");
		manege.descendreDuManege();
		System.out.println("Etat des places du manège");
		System.out.println(manege.getPlace()+" place");
		System.out.println("File d'attente après descendu du manège");
		System.out.println(manege.getFileDattente() +" file");
		manege.gain();
		
		System.out.println("File d'attente avant de monter dans le manège");
		System.out.println(manege.getFileDattente());
		manege.monterDansLeManege();
		System.out.println("File d'attente après être monter dans le manège");
		System.out.println(manege.getFileDattente() +" file");
		System.out.println("Etat des places du manège");
		System.out.println(manege.getPlace()+" place");
		
		manege.demarrer();
		
		System.out.println("On descend!");
		manege.descendreDuManege();
		System.out.println("Etat des places du manège");
		System.out.println(manege.getPlace()+" place");
	}

}
