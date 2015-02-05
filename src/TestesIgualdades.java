
public class TestesIgualdades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c1 = new Conta();
		c1.dono = "Pedro";
		c1.saldo = 227;
		
		Conta c2 = new Conta();
		c2.dono = "Duke";
		c2.saldo = 227;
		
		if (c1==c2){
			
			System.out.println("Contas Iguais");
		}

	}

}
