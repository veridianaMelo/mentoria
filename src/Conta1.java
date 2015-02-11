//Primeiro exercício, criação da classe conta
public class Conta1 {

	int numero_conta;
	String dono_conta;
	double saldo_conta;
	double limite_conta;
	Cliente7 titular = new Cliente7();

	void sacar(double qtd){
		double novoSaldo = this.saldo_conta - qtd;
		this.saldo_conta = novoSaldo;
	}
	void depositar(double qtd){
		this.saldo_conta = this.saldo_conta + qtd;
	}
	boolean saca(double valor){
		if(this.saldo_conta < valor){
			return false;
		} else {
			this.saldo_conta = this.saldo_conta - valor;
			return true;
		}}
	void transferir(Conta1 destino, double valor){
		this.saldo_conta = this.saldo_conta - valor;
		destino.saldo_conta = destino.saldo_conta + valor;

	}
	
	
	boolean transfere(Conta1 destino, double valor){
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
