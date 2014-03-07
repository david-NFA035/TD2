package nfa035.tp2;

public class Exo1Puissance {
	/**
	 * Calcule a puissance n.
	 * Si a est 0 et n est négatif, doit lancer une {@link ArithmeticException}
	 * @param a un réel 
	 * @param n un entier quelconque
	 * @return a puissance n
	 * @throws ArithmeticException si a == 0 et n est strictement négatif.
	 */
	public static double puissance(double a, int n) throws ArithmeticException {
		double resultat = 1;
		
		// traitement pour n positif
		if (n >= 0){
			while (n > 0){
				resultat *= a;
				n--;
			}
		}
		// traitement pour n négatif
		else {
			// on isole le cas particulier
			if (a == 0) throw new ArithmeticException();
			// on traite le cas général
			while (n < 0){
				resultat /= a;
				n++;
			}
		}
		return resultat;
	}
}
