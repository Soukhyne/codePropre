package ex3;

import java.util.List;

public class ZoneCarnivore {

	private List<String> types;
	private List<String> noms;
	private List<String> comportements;
	
	public void addAnimal(Carnivore carnivore) {
		types.add(carnivore.getTypes());
		noms.add(carnivore.getNoms());
		comportements.add(carnivore.getComportements());
	}
	
	public void afficherListeAnimaux(){
		for (String nom: noms){
			System.out.println(nom);
		}
	}
	
	public double calculerKgsNourritureParJour(){
		return noms.size() * 10;
	}
}
