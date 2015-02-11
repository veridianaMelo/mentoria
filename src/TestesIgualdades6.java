
public class TestesIgualdades6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta1 c1 = new Conta1();
		c1.dono_conta = "Pedro";
		c1.saldo_conta = 227;
		
		Conta1 c2 = new Conta1();
		c2.dono_conta = "Duke";
		c2.saldo_conta = 227;
		
		if (c1==c2){
			
			System.out.println("Contas Iguais");
		}

	}

}
