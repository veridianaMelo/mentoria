
public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta minhaConta; 
		minhaConta = new Conta();
		
		minhaConta.dono = "José Pedro";
		minhaConta.saldo = 1000;
		
		Conta meuSonho;
		meuSonho = new Conta();
		meuSonho.saldo = 1500;
		
		System.out.println(meuSonho.saldo); 
		System.out.println("O saldo é:" + minhaConta.saldo);
	    
	}

}
