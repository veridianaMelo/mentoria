import java.util.Scanner;
import javax.swing.JOptionPane;

public class ExercicioArray2 {

	public static void main(String[] args) {
		
	 Scanner teclado = new Scanner(System.in);  
     int vec[] = new int[10];  
     int maior = Integer.MIN_VALUE, // Menor valor, porque qualquer valor vai ser maior que ele;  
          menor = Integer.MAX_VALUE, // Maior valor, porque qualquer valor vai ser menor que ele;  
          media = 0;  
     for(int x = 0; x < vec.length; x++){  
         System.out.println("Digite o " + (x + 1) + "� de " + vec.length + " n�meros:");  
         vec[x] = teclado.nextInt();  
         media += vec[x];  
         if(vec[x] < menor){  
             menor = vec[x];  
         }  
         if(vec[x] > maior){  
             maior = vec[x];  
         }  
     }  
     System.out.println("O maior n�mero digitado foi: " + maior + ";\n" +  
             "O menor n�mero digitado foi: " + menor + ";\n" +  
             "A m�dia dos n�meros digitados foi: " + (media / vec.length) + ".");
	}
}
