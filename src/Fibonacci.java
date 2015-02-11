
public class Fibonacci {
	
	static long fibo(int n){
		return (n < 2) ? n : fibo(n - 1) + fibo( n - 2);
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for (int i = 0; i < 30; i++){
    		System.out.println("(" + i + ");" + Fibonacci.fibo(i) + "\t");
    }
	}
}
