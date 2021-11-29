package ex3;

import java.util.List;

public class FermeReptile {

	private List<String> types;
	private List<String> noms;
	private List<String> comportements;
	
	public void addAnimal(Reptile reptile) {
		types.add(reptile.getTypes());
		noms.add(reptile.getNoms());
		comportements.add(reptile.getComportements());
	}
	
	public void afficherListeAnimaux(){
		for (String nom: noms){
			System.out.println(nom);
		}
	}
	
	public int compterAnimaux(){
		return noms.size();
	}
	
	public double calculerKgsNourritureParJour(){
		return noms.size() * 0.1;
	}
}
