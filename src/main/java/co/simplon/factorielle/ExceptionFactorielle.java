package co.simplon.factorielle;

public class ExceptionFactorielle extends Exception {

	public ExceptionFactorielle() {
		super ();
	}
	
	public String monException (){
		String monMessage = "";
		return monMessage ="La variable de long ne peut contenir une factorielle de chiffre supérieur à 49";
	}
}
