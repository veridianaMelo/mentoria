package ProblemasDoBanqueiro;

public class ExcecaoSaqueInsuficiente extends Exception{
	public ExcecaoSaqueInsuficiente(){
		super("Saldo insuficiente");
	}

}
