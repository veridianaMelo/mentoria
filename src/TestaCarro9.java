
public class TestaCarro9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro9 meuCarro;
		meuCarro = new Carro9 ();
		meuCarro.cor = "Verde";
		meuCarro.modelo = "Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		meuCarro.liga();
		
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
	}

}
