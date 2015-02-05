
public class Conta {


	int numero;
	String dono;
	double saldo;
	double limite;
	Cliente titular = new Cliente();

	void sacar (double qtd){  //void diz que qdo a conta sacar uma quantia, nenhuma informação será enviada de volta.
		double novoSaldo = this.saldo - qtd;
		this.saldo = novoSaldo;
		//usamos a palavra chave this para mostrar que esse é um atributo, e não uma simples variável.)
	}

	boolean saca(double valor){
		if(this.saldo < valor){
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}}



	void depositar (double quantidade){
		this.saldo += quantidade;
	}

	void transferir(Conta destino, double valor){
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;

	}

	boolean transfere(Conta destino, double valor){
		boolean retirou = this.saca(valor);
		if (retirou == false){
			return false; }
		else {
			destino.depositar(valor);
			return true;}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
