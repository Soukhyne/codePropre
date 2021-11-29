package ex3;

import java.util.List;

public class Aquarium {

	private List<String> types;
	private List<String> noms;
	private List<String> comportements;
	
	public void addAnimal(Poisson poisson) {
		types.add(poisson.getTypes());
		noms.add(poisson.getNoms());
		comportements.add(poisson.getComportements());
	}
	
	public void afficherListeAnimaux(){
		for (String nom: noms){
			System.out.println(nom);
		}
	}
	
	public double calculerKgsNourritureParJour(){
		return noms.size() * 0.2;
	}
}
