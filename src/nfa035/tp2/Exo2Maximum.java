package nfa035.tp2;

public class Exo2Maximum {
	/**
	 * Renvoie le maximum d'un tableau.
	 * @param tab un tableau non vide
	 * @return le maximum d'un tableau
	 * @throws IllegalArgumentException si le tableau est vide
	 * @throws NullPointerException si le tab vaut null
	 */
	public static double maximum(double [] tab) throws IllegalArgumentException {
		if (tab.length == 0) throw new IllegalArgumentException();
		double m= -Double.MAX_VALUE;
		for (int i= 0; i < tab.length; i++) {
			if (tab[i] > m) m= tab[i];
		}
		return m;
	}
}
