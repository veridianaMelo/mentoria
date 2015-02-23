//Primeiro exercício, criação da classe conta
public class Conta {

	 int numeroConta;
	 String donoConta;
	 double saldoConta;
	 double limiteConta;
	 Cliente titular = new Cliente();

	void sacar(double qtd){
		double novoSaldo = this.saldoConta - qtd;
		this.saldoConta = novoSaldo;
	}
	
	void depositar(double qtd){
		this.saldoConta = this.saldoConta + qtd;
	}
	
	boolean saca(double valor){
		if(this.saldoConta < valor){
			return false;
		} else {
			this.saldoConta = this.saldoConta - valor;
			return true;
		}}
		
	boolean transfere(Conta destino, double valor){
		boolean retirou = this.saca(valor);
		if (retirou == false){
			return false; }
		else {
			destino.depositar(valor);
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
