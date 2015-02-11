//Classe responsavel pela entidade carro
public class Carro9 {
	
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	Motor9 motor;
	
	
	void liga(){
		System.out.println("Carro está ligado");
	}
	
	void acelera(double quantidade){
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	
	int pegaMarcha(){
		if(this.velocidadeAtual<0 ){
			return -1;
		}if(this.velocidadeAtual >= 0 && this.velocidadeAtual < 40){
			return 1;
		} if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80){
			return 2;
		} return 3;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
