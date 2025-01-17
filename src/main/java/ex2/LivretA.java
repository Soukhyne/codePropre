package ex2;

/** Représente un compte bancaire de type livret A 
 * @author DIGINAMIC
 */

public class LivretA extends CompteBancaire {
	
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/** Ce constructeur est utilisé pour créer un compte de type Livret A
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
	 * @param tauxRemuneration  représente le taux de rémunération du livret A
	 */
	public LivretA(double solde, double découvert, double tauxRemuneration) {
		super(solde, découvert);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	@Override
	public void debiterMontant(double montant) {
		double soldeTransit = this.getSolde() - montant;
		if (soldeTransit > 0){
			this.setSolde(soldeTransit);
		}
	}
	
	/** Cette méthode applique un pourcentage de rémunération annuelle au livret A
	 */
	public void appliquerRemuAnnuelle(){
		double soldeTransit = this.getSolde() + this.getSolde()*tauxRemuneration/100;
		this.setSolde(soldeTransit);
	}

	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
}
