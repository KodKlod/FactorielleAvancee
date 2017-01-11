package co.simplon.factorielle;

/**
 * Factorielle
 */
public class Factorielle 
{
    public Factorielle() {
    		super();
    }
    
    public long calculer(long n) throws ExceptionFactorielle {
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
