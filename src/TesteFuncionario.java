import java.text.SimpleDateFormat;
import java.util.Date;


public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		Funcionario f1 = new Funcionario();
		Data data4 = new Data();
        f1.nomeFuncionario = "Jonnes";
        f1.salarioFuncionario = 1000.0;
        f1.receberAumento(1500);
        f1.dataFuncionario = data4;
        
        
        Funcionario f2 = new Funcionario();
        f2.nomeFuncionario = "Maria ";
        f2.departamentoFuncionario = "Peixaria";
        f2.dataFuncionario =  data4;
        f2.rgFuncionario = "555000";
        f2.salarioFuncionario = 1500.0;
        
        Funcionario f3 = new Funcionario(); 
        f3.nomeFuncionario = "Maria ";
        f3.departamentoFuncionario = "Peixaria";
      //  f3.dataFuncionario = 15;
        f3.rgFuncionario = "555000";
        f3.salarioFuncionario = 1500.0;
        
       
       
        if (f2 == f3){
        	System.out.println("Iguais");
        } else{
        	System.out.println("Diferente");
        }
           
        
        
        //System.out.println("O salário atual é :"+  f1.salarioFuncionario);
	    //System.out.println("Ganho atual é:" + f1.calcularGanhosAnuais());
	   
	    }

}
