import java.util.*;
import java.math.*;
public class fib {
	
	public static void main(String[] args) {
    	
    	System.out.println("Please input n-th Fibonacci serial you want to calculate.");
    	Scanner input = new Scanner(System.in);
    	int N = input.nextInt();
    	BigInteger[] memo = new BigInteger[N+1];
    	
    	System.out.println(fib(N,memo));
    	
	}
	
	public static BigInteger fib(int N , BigInteger[] memo){
		
		if(memo[N] != null  ){
			return memo[N];
		}
		
		if(N==1 || N==2){
			memo[N]=BigInteger.ONE;
			return memo[N];
		}
		else{
			memo[N]=fib(N-1 , memo).add(fib(N-2 , memo));
			return memo[N];
		}
	}

}
