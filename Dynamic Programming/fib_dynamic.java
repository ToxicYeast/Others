import java.util.*;
import java.math.*;
public class fib_dynamic {
	
	public static void main(String[] args) {
    	
    	System.out.println("Please input n-th Fibonacci serial you want to calculate.");
    	Scanner input = new Scanner(System.in);
    	int N = input.nextInt();
    	BigInteger[] memo = new BigInteger[N+1];  //use BigInteger to store 
    	
    	System.out.println(fib(N,memo));
    	
	}
	
	public static BigInteger fib(int N , BigInteger[] memo){		//use dynamic drogramming to redece recusive ; O(n)=n
		
		if(memo[N] != null  ){
			return memo[N];		//if array element is not empty, return it
		}
		
		if(N==1 || N==2){
			memo[N]=BigInteger.ONE;		//set fib(1),fib(2) as one in BigInteger
			return memo[N];		
		}
		else{
			memo[N]=fib(N-1 , memo).add(fib(N-2 , memo));  //calculte n-th fib number 
			return memo[N];
		}
	}

}