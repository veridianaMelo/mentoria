    import java.io.BufferedReader;  
    import java.io.IOException;  
    import java.io.InputStreamReader;  
      
    public class ExercicioArray4  {  
      
        public static void main(String[] args) throws NumberFormatException, IOException {  
            
        	int[] array = new int[10];
    		int menor = Integer.MAX_VALUE;          
            int maior = 0;          
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
              
            // Looping para s 3 números  
            for (int i = 0; i < 10; i++) {  
                System.out.print("Digite o " + (i + 1) + " número:> ");  
                int readed = Integer.parseInt(br.readLine());  
                // Verifica se o número é o menor  
                if (readed < menor) {  
                    menor = readed;  
                }  
    //          Verifica se o número é o maior  
                if (readed > maior) {  
                    maior = readed;  
                }              
            }  
            // Imprime os resultados  
            System.out.println("O menor número: " + menor);  
            System.out.println("O maior número: " + maior);  
        }  
          
    }  