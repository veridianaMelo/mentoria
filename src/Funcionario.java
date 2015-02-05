
public class Funcionario {
	
	String nomeFuncionario;
	String departamentoFuncionario;
	Double salarioFuncionario;
	Data dataFuncionario;
	String rgFuncionario;
	
	void receberAumento(double salario){
		this.salarioFuncionario = this.salarioFuncionario + salario;
	}
	
	void mostra(){
		System.out.println("Nome : " + this.nomeFuncionario );
		System.out.println("Departamento:" + this.departamentoFuncionario);
	    System.out.println("Salário:" + this.salarioFuncionario);
	    System.out.println("Dia: " + this.dataFuncionario.dia);
	    System.out.println("Mês:" + this.dataFuncionario.mes);
	    System.out.println("Ano:" + this.dataFuncionario.ano);
	    System.out.println("RG:" + this.rgFuncionario);
	    System.out.println("Ganhos Anuais" + this.calcularGanhosAnuais());
	}
	
	Double calcularGanhosAnuais(){
		this.salarioFuncionario = this.salarioFuncionario * 12;
		return salarioFuncionario;
		
	}

	
}
