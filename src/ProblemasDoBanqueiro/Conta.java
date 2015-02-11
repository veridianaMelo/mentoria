package ProblemasDoBanqueiro;

public class Conta {
	private int numeroConta;
	private Double saldoTotal;
	private Double saldoRetido;
	private String nomeDoCliente;

	public int getNumeroConta() {//retorna o número da conta
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Double getSaldoTotal() {//retorna o saldo total
		return saldoTotal;
	}
	public void setSaldoTotal(Double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
	public Double getSaldoRetido() { // retorna o saldo retido
		return saldoRetido;
	}
	public void setSaldoRetido(Double saldoRetido) {
		this.saldoRetido = saldoRetido;
	}
	public String getnomeDoCliente(){ // retorna o nome do cliente
		return nomeDoCliente;
	}
	public void setNomeDoCliente(String nomedoCliente){
		this.nomeDoCliente = nomedoCliente;
	}
	// Construtor sem argumentos
	public Conta(){
	}
	// o construtor Conta inicializa os atributos
	public Conta(int numeroConta, Double saldoTotal, Double saldoRetido, String nomeDoCliente ){
		this.numeroConta = numeroConta;
		this.saldoTotal = saldoTotal;
		this.saldoRetido = saldoRetido;
		this.nomeDoCliente = nomeDoCliente;
	}

	public boolean validarNumeroConta(int usuarioNumeroConta){
		if(usuarioNumeroConta == numeroConta)
			return true;
		else
			return false;
	}

	public void depositar(double montante){
	
			
			saldoRetido = saldoRetido + montante;
			saldoTotal = saldoRetido;	
		
	}



	public void sacar (int montante) throws ExcecaoSaqueInsuficiente{
		System.out.println("Qual o valor que deseja sacar");
		if ( this.saldoTotal >= montante){
			this.saldoTotal = this.saldoTotal - montante;
			} else {
			throw new ExcecaoSaqueInsuficiente();
			}
	}
	
//	private int displayMenuOfAmounts(){
		
	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

