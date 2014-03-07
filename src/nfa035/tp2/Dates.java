package nfa035.tp2;

/**
 * On représente une date avec un tableau de 3 entiers.
 * <ul>
 * <li>case 0 : numéro du jour
 * <li>case 1 : numéro du mois
 * <li>case 2 : numéro de l'année
 * </ul>
 * 
 * @author rosmord
 * 
 */
public class Dates {
	
	static String[] nomsDesMois = {"janvier", "février", "mars", "avril", "mai", "juin",
			"juillet", "août", "septembre", "octobre", "novembre", "décembre"};
	
	static int[] dureeDesMois = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	/**
	 * Retourne le nom du mois numéro numero.
	 * 
	 * @param numero
	 *            le numéro du mois (commence à 1)
	 * @return le nom du mois.
	 * @throws IllegalArgumentException si mois n'est pas entre 1 et 12.
	 */
	public static String nomMois(int numero) throws IllegalArgumentException{
		if (numero == 0 || numero > 12) throw new IllegalArgumentException();
		return nomsDesMois[numero -1];
	}

	/**
	 * Renvoie vrai si une année est bissextile.
	 * @param annee
	 * @return
	 */
	public static boolean estBissextile(int annee) {
		return ((annee % 4) == 0 && (annee % 100) != 0 ) || (annee % 400) == 0 ? true : false;
	}

	/**
	 * retourne la représentation de la date sous forme de String.
	 * 
	 * @param date
	 * @return
	 * @throws IllegalArgumentException si la date n'est pas correcte.
	 */
	public static String commeString(int[] date) throws IllegalArgumentException {
		if (!(estDateCorrecte(date))) throw new IllegalArgumentException();
		return (date[0] + " " + nomMois(date[1]) + " " + date[2]);
	}
	
	
	/**
	 * Retourne vrai si une date est correcte (à vous de préciser ce que ça signifie).
	 * @param date
	 * @return vrai si les trois paramètres correspondent à une vraie date.
	 */
	public static boolean estDateCorrecte(int[] date) {
		return date[1] > 0 && date[1] <= 12 && date[2] > 0 && date[0] > 0 && date[0] <= nombreDeJoursDansMois(date[1], date[2]) ? true : false;
	}
	
	/**
	 * Retourne le nombre de jour dans un mois pour une année donnée.
	 * @param mois
	 * @param annee
	 * @return
	 * @throws IllegalArgumentException si le numéro du mois n'est pas correct.
	 */
	public static int nombreDeJoursDansMois(int mois, int annee) throws IllegalArgumentException {
		if (mois == 0 || mois > 12 || annee < 1) throw new IllegalArgumentException();
		return estBissextile(annee) && mois == 2 ? 29 : dureeDesMois[mois -1];
	}
	
	/**
	 * Retourne la date du jour suivant une date donnée
	 * @param date une date
	 * @return la date du jour suivant.
	 * @throws IllegalArgumentException si la date n'est pas correcte.
	 */
	public static int [] dateSuivante(int [] date) {
		int [] date_temp = {date[0] + 1, date[1], date[2]};
		if (estDateCorrecte(date_temp)){
			return date_temp;
		}
		else {
			date_temp[0] = 1;
			date_temp[1] += 1;
			if (estDateCorrecte(date_temp)){
				return date_temp;
			}
			else {
				date_temp[1] = 1;
				date_temp[2] += 1;
				return date_temp;
			}
		}
	}
}
