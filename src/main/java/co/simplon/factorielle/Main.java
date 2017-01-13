package co.simplon.factorielle;

public class Main {

	static long resultatFacto;

	public Main() {
		super();
	}

	public static void main(String[] entier) {
		//Exemple d'initialisation des arguments "entier" de la méthode
		//String[] tab = new String[]{"Toto"};
		//System.out.println(tab[0]);
		//Et conversion en type Long
		//String input = entier[0];
		//Long conversion = long.parseLong(input);
		
		Factorielle factorielle = new Factorielle();
		String name = entier[0];
		long conversion = 0;
		try {
			conversion = Long.parseLong(name);
			resultatFacto = factorielle.calculer(conversion);
			System.out.println("Cas passant : La factorielle de " + name + " est : "+ resultatFacto);
		} catch (NumberFormatException e1) {
			System.out.println("Cas erreur 1 : Problème de conversion");
		} catch (IllegalArgumentException e2) {
			System.out.println("Cas erreur 2 : Le chiffre est négatif. La factorielle ne peut être calculée.");
		} catch (ExceptionFactorielle e3) {
			System.out.println("Cas erreur 3 : Le résultat du calcul est trop grand. La variable ne peut pas gérer");
		}
	}
}
