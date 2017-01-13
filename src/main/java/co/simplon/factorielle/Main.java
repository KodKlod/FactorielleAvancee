package co.simplon.factorielle;

public class Main {

	static Factorielle factorielle;
	static long resultatFacto;

	public Main() {
		super();
	}

	public static void main(String[] entier) {
		factorielle = new Factorielle();
		String name = entier[0];
		long conversion = 0;
		try {
			conversion = Long.parseLong(name);
		} catch (NumberFormatException e1) {
			System.out.println("Cas erreur 1 : Problème de conversion");
			//System.exit(0);
			return;
		}

		try {
			resultatFacto = factorielle.calculer(conversion);
			System.out.println("Cas passant : La factorielle de " + name + " est : "+ resultatFacto);
		} catch (ExceptionFactorielle e3) {
			System.out.println("Cas erreur 3 : Le résultat du calcul est trop grand. La variable ne peut pas gérer");
		} catch (IllegalArgumentException e2) {
			System.out.println("Cas erreur 2 : Le chiffre est négatif. La factorielle ne peut être calculée.");
		}
	}

}
