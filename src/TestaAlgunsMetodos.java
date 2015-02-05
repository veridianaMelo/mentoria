
public class TestaAlgunsMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.dono = "Duke";
		minhaConta.saldo = 1900;
		
		minhaConta.sacar(200);
		
		minhaConta.depositar(500);
		
		System.out.println(minhaConta.saldo);
		
		minhaConta.saldo = 1000;
		
		boolean consegui = minhaConta.saca(200);
		if (consegui){
			System.out.println("Consegui sacar");
		}else {
			System.out.println("Não consegui sacar");
		}
		
		
		minhaConta.saldo = 1000;
		if(minhaConta.saca(2000)){
			System.out.println("Consegui sacar");
		}else {
			System.out.println("Não consegui sacar");
		}

	}

}
