
public class ExercicioArray {

		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] idades;//declara um array de inteiros
		idades = new int[10]; // aloca memória para 10 inteiros
		idades[5] = 8; // atribui ao 6º elemento o valor de 8
		System.out.println(idades[5]); // imprime o array na posição sexta
		
		//int n = 0;
		//int[] numeroDeBilhetes = new int[n];

		Conta1[] minhasContas;
		minhasContas = new Conta1[10];
		//System.out.println(minhasContas[0].saldo_conta);
		
		Conta1 contaNova = new Conta1();
		contaNova.saldo_conta = 1000;
		minhasContas[0] = contaNova;
		
		minhasContas[1] = new Conta1();
		minhasContas[1].saldo_conta = 3200;
		System.out.println(minhasContas[1].saldo_conta);
	}

}
