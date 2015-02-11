
public class TestaAlgunsMetodos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta1 minhaConta = new Conta1();

		minhaConta.dono_conta = "Ze Alfredo";
		minhaConta.saldo_conta = 1000;
		minhaConta.saca(300);
		System.out.println("O saldo atual é:"+ minhaConta.saldo_conta);
		minhaConta.depositar(555);
		System.out.println("O novo saldo é:" + minhaConta.saldo_conta);
		System.out.println("\n");

		Conta1 poupanca = new Conta1();

		poupanca.dono_conta = "Rodrigo Alves Alcântara" ;
		poupanca.saldo_conta = 100;
		poupanca.depositar(100.35);
		System.out.println("O novo saldo é:" + poupanca.saldo_conta);
		poupanca.saca(2);
		System.out.println("O novo saldo é:" + poupanca.saldo_conta);
		System.out.println("\n");

		Conta1 contaMaster = new Conta1();

		contaMaster.dono_conta = "Richard";
		contaMaster.saldo_conta = 3;
		contaMaster.depositar(1);
		System.out.println("O novo saldo é:" + contaMaster.saldo_conta) ;

		contaMaster.saca(0.50);
		System.out.println("O novo saldo é:" + contaMaster.saldo_conta);



		if (minhaConta.saca(2)) {
			System.out.println("Consegui sacar");
		} else {
			System.out.println("Não consegui sacar");
		}


		minhaConta.transfere(poupanca, 35);
		System.out.println(poupanca.saldo_conta);

	}

}
