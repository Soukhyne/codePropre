package ex1;

import java.util.Date;

/** Classe qui permet d'afficher le statut d'une entreprise
 * @author Madeline
 *
 */
public class Entreprise {

	/**
	 * faire javadoc des variables
	 */
	private int siret;
	private String nom;
	private String adresse;
	private Date dateCreation;
	
	private static final int CAPITAL_MAX = 3000000;
	
	/**
	 *  méthode qui affiche le statut de l'entreprise
	 */
	public void afficherStatut(){
		
	}

	/** getter de Siret
	 * @return le siret
	 */
	public int getSiret() {
		return siret;
	}

	/** setter de Siret - permet sa mise à jour
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/** getter de nom
	 * @return le nom
	 */
	public String getNom() {
		return nom;
	}

	/** setter de Nom - permet sa mise à jour
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** getter de Adresse
	 * @return l'adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/** setter de Adresse - permet sa mise à jour
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/** getter de DateCreation
	 * @return la date de creation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/** setter de DateCreation - permet sa mise à jour
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/** getter de Capital Max
	 * @return l'entier correspondant à capital max
	 */
	public static int getCapitalMax() {
		return CAPITAL_MAX;
	}
	
	
}
