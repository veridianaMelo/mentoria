
public class Teste8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta1 minhaConta = new Conta1();
		Cliente7 c = new Cliente7();
		minhaConta.titular = c; 
		
		Cliente7 clienteDaMinhaConta = minhaConta.titular;
		clienteDaMinhaConta.nome = "Duke";
		
		minhaConta.titular.nome = "Duke";
		
		
		Conta1 minhaConta1 = new Conta1();
		minhaConta1.saldo_conta = 1020;
		
		
		minhaConta.transferir(minhaConta1, 50);
	    System.out.println(minhaConta1);
	    System.out.println(minhaConta);
	
	}
	

}
