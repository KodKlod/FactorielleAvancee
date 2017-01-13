package co.simplon.factorielle;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
	
	@Test
	public void factorielleDe1DoitRenvoyer1() {
		Main.main(new String[]{"1"});
	}

	
	@Test
	public void factorielleDe0DoitRenvoyer1() {
		Main.main(new String[]{"0"});
	}


	@Test()
	public void factorielleDe50NEstPasCalculable(){
		Main.main(new String[]{"50"});
	}
	
	
	@Test()
	public void factorielleNombreNegatifDeclencheUneException(){
		Main.main(new String[]{"-2"});
	}
	
	
	@Test
	public void factorielleDe3DoitRenvoyer6() {
		Main.main(new String[]{"3"});
	}
	
	
	@Test
	public void factorielleDe9DoitRenvoyer362880() {
		Main.main(new String[]{"9"});
	}

	
	@Test
	public void laVariableConversionNestPasUnLong() {
		Main.main(new String[]{"banane"});
	}
}
