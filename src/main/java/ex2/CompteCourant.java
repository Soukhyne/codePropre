package ex2;

/** Représente un compte bancaire de type compte courante
 * @author DIGINAMIC
 */
public class CompteCourant extends CompteBancaire {

	/** Ce constructeur est utilisé pour créer un compte de type compte courant
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
	 */
	public CompteCourant(double solde, double decouvert) {
		super(solde, decouvert);
		
	}

	@Override
	public void debiterMontant(double montant) {
		double soldeTransit = this.getSolde() - montant;
		if (soldeTransit > this.getDecouvert()){
			this.setSolde(soldeTransit);
		}
		
	}


}
