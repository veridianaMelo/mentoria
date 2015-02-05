
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta minhaConta = new Conta();
		Cliente c = new Cliente();
		minhaConta.titular = c;
		
		Cliente clientedaMinhaConta = minhaConta.titular;
		clientedaMinhaConta.nome = "Duke";
		minhaConta.titular.nome = "Duke";

	}

}
