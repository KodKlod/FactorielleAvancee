package co.simplon.factorielle;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
	
	@Test
	public void factorielleDe1DoitRenvoyer1() {
		Main.main(new String[]{"1"});
	}


	@Test(expected = ExceptionFactorielle.class)
	public void factorielleDe50NEstPasCalculable(){
		Main.main(new String[]{"50"});
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void factorielleNombreNegatifDeclencheUneException(){
		Main.main(new String[]{"-2"});
	}
	
	
	@Test
	public void factorielleDe3DoitRenvoyer6() {
		Main.main(new String[]{"3"});
	}
}
