
public class TestaAlgunsMetodos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta minhaConta = new Conta();

		minhaConta.donoConta = "Ze Alfredo";
		minhaConta.saldoConta = 1000;
		minhaConta.saca(300);
		System.out.println("O saldo atual �:"+ minhaConta.saldoConta);
		minhaConta.depositar(555);
		System.out.println("O novo saldo �:" + minhaConta.saldoConta);
		System.out.println("\n");

		Conta poupanca = new Conta();

		poupanca.donoConta = "Rodrigo Alves Alc�ntara" ;
		poupanca.saldoConta = 100;
		poupanca.depositar(100.35);
		System.out.println("O novo saldo �:" + poupanca.saldoConta);
		poupanca.saca(2);
		System.out.println("O novo saldo �:" + poupanca.saldoConta);
		System.out.println("\n");

		Conta contaMaster = new Conta();

		contaMaster.donoConta = "Richard";
		contaMaster.saldoConta = 3;
		contaMaster.depositar(1);
		System.out.println("O novo saldo �:" + contaMaster.saldoConta) ;

		contaMaster.saca(0.50);
		System.out.println("O novo saldo �:" + contaMaster.saldoConta);

		poupanca.transfere(contaMaster, 5);
		System.out.println("O novo saldo da poupanca �:" + poupanca.saldoConta);
		System.out.println("O novo saldo da conta master �:" + contaMaster.saldoConta);

		if (minhaConta.saca(2)) {
			System.out.println("Consegui sacar");
		} else {
			System.out.println("N�o consegui sacar");
		}


		minhaConta.transfere(poupanca, 35);
		System.out.println(poupanca.saldoConta);

	}

}
