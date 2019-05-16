import java.util.*;
public class fib_normal {
	public static void main(String[] args) {
		System.out.println("Please input n-th Fibonacci serial you want to calculate");
    	Scanner input = new Scanner(System.in);
    	int N = input.nextInt();
    	
    	System.out.println(fib(N));
    	
	}
	
	public static int fib(int N){
		if(N==1 || N==2){
			return 1;
		}
		return fib(N-1) + fib(N-2);
	}
}