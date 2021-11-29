package ex3;

public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	/*public void addAnimal(Animal animal){
		if (animal.getClass() == Carnivore){
			zoneCarnivore.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals("MAMMIFERE") && comportement.equals("HERBIVORE")){
			savaneAfricaine.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals("REPTILE")){
			fermeReptile.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals("POISSON")){
			aquarium.addAnimal(typeAnimal, nomAnimal, comportement);
		}
	}*/
	
	public void addCarnivore(Carnivore carnivore) {
		zoneCarnivore.addAnimal(carnivore);
	}
	
	public void addHerbivore(Herbivore herbivore) {
		savaneAfricaine.addAnimal(herbivore);
	}
	
	public void addReptile(Reptile reptile) {
		fermeReptile.addAnimal(reptile);
	}
	
	public void addPoisson(Poisson poisson) {
		aquarium.addAnimal(poisson);
	}
	
	
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
