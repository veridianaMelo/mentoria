
public class Programa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Conta1();

		Conta1 minhaConta; 
		minhaConta = new Conta1();

		minhaConta.numero_conta = 123456;
		minhaConta.dono_conta = "Z� Alfredo";
		minhaConta.saldo_conta = 10000;
		minhaConta.limite_conta = 1200;

		System.out.println("O n�mero da conta �:" + minhaConta.numero_conta);
		System.out.println("A conta pertence a:" + minhaConta.dono_conta);
		System.out.println("O saldo da conta �:" + minhaConta.saldo_conta); 
		System.out.println("O limite da conta  �:" + minhaConta.limite_conta);
		System.out.println("\t");

		Conta1 meuSonho;
		meuSonho = new Conta1();

		meuSonho.numero_conta = 654321;
		meuSonho.dono_conta = "Maria Marta";
		meuSonho.saldo_conta = 15000;
		meuSonho.limite_conta = 1300;

		System.out.println("O n�mero da conta �:" + meuSonho.numero_conta);
		System.out.println("A conta pertence a:" + meuSonho.dono_conta);
		System.out.println("O saldo da conta �:" + meuSonho.saldo_conta);
		System.out.println("O limite da conta �:" + meuSonho.limite_conta);
		System.out.println("\n");

		Conta1 	meuDesejo = new Conta1();

		meuDesejo.numero_conta = 999999;
		meuDesejo.dono_conta = " Sr. Noventa e Nove";
		meuDesejo.saldo_conta = 23000;
		meuDesejo.limite_conta = 2000;

		System.out.println("O n�mero da conta �:" + meuDesejo.numero_conta);
		System.out.println("A conta pertence a:" + meuDesejo.dono_conta);
		System.out.println("O saldo da conta �:" + meuDesejo.saldo_conta);
		System.out.println("O limite da conta �:" + meuDesejo.limite_conta);
		System.out.println("\n");

		Conta1 minhaMeta = new Conta1();

		minhaMeta.numero_conta = 888888; 	
		minhaMeta.dono_conta = "Sra. Oitente e oito";
		minhaMeta.saldo_conta = 34000;
		minhaMeta.limite_conta = 2000;

		System.out.println("O n�mero da conta �:" + minhaMeta.numero_conta);
		System.out.println("A coonta pertence a:" + minhaMeta.dono_conta);
		System.out.println("O saldo da conta �:" + minhaMeta.saldo_conta);
		System.out.println("O limite da conta �:" + minhaMeta.limite_conta );




	}


}


