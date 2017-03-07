package co.simplon.factorielle;

public class ExceptionFactorielle extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String msg;
	
	public ExceptionFactorielle()
	{
		super ();
	}
	//On peut éventuellement créer un constructeur porteur d'un msg
	public ExceptionFactorielle(String msg) {
		super();
		this.setMsg("msg");
	}
	//Ou mieux encore un constructeur avec la cause de l'exception
	public ExceptionFactorielle (Exception cause){
		super(cause);
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}



}
