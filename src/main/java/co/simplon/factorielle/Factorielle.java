package co.simplon.factorielle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Factorielle
 */
public class Factorielle 
{
    //Déclaration d'un traceur 
	private static final Logger LOGUEUR 
	= LoggerFactory.getLogger (Factorielle.class.getName());
	
    public Factorielle() {
    		super();
    }
    
    //Les throws permettent que les exceptions
    //apparaîssent plus facilement dans la Javadoc
    //Et faciliteront la construction des Try/catch
    public long calculer(long n) throws ExceptionFactorielle, IllegalArgumentException{
    	//Génération d'une trace
    	LOGUEUR.info("Trace");
    		if (n > 1) {
    			long resultat = n * calculer(n-1);
    			if (resultat<0) {
    				throw new ExceptionFactorielle();
    			}
    			return resultat;
    		} else if (n < 0) {
    			throw new IllegalArgumentException();
    		}
    		return 1;
    }
    
}
