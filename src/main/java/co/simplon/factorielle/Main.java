package co.simplon.factorielle;

public class Main {

	static Factorielle factorielle;
	static long resultatFacto;

	public Main() {
		super();
	}

	public static void main(String[] entier) {
		/*
		 * Lancer le calcul de la Factorielle avec un argument réel (args[0]) et
		 * afficher le résultat dans la console
		 */
		factorielle = new Factorielle();
		String name = entier[0];
		long conversion=Long.parseLong(name);
		
		try {
			resultatFacto = factorielle.calculer(conversion);
			System.out.println("La factorielle de " + name + " est : " + resultatFacto);

		} catch (ExceptionFactorielle e) {
			// Exception variable long trop "courte"
			System.out.println("Le résultat du calcul est trop grand. La variable ne peut pas gérer");
		} catch (IllegalArgumentException e) {
			// Exception chiffre négatif
			System.out.println("Le chiffre est négatif. La factorielle ne peut être calculée.");
		}
	}

}
