package ex3;

import java.util.List;

public class SavaneAfricaine {

	private List<String> types;
	private List<String> noms;
	private List<String> comportements;
	
	public void addAnimal(Herbivore herbivore) {
		types.add(herbivore.getTypes());
		noms.add(herbivore.getNoms());
		comportements.add(herbivore.getComportements());
	}
	
	public void afficherListeAnimaux(){
		for (String nom: noms){
			System.out.println(nom);
		}
	}
	
	public int compterAnimaux(){
		return noms.size();
	}
	
	public int calculerKgsNourritureParJour(){
		return noms.size() * 10;
	}
}
