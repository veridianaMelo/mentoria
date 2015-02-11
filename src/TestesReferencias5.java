
public class TestesReferencias5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Conta1 conta = new Conta1();
	conta.depositar(100);
	
	Conta1 c2 = conta;
	c2.depositar(2900);
	
	System.out.println(conta.saldo_conta);
	System.out.println(c2.saldo_conta);
		
	Conta1 conta0 = new Conta1();
	conta0.dono_conta = "Duke";
	conta0.saldo_conta = 227;
	
	Conta1 conta2 = new Conta1();
	conta2.dono_conta = "Duke";
	conta2.saldo_conta = 227;
	//Como em cada uma dessas variáveis guardamos duas contas criadas diferentemente, elas estão em espaços diferentes da memória,
	//o que faz o teste no if valer false.//
	if(conta0 == conta2){
		System.out.println("Contas iguais");
	}
	
	}
	
	}
