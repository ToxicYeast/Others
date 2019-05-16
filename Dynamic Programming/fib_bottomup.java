import java.util.*;
import java.math.*;


public class fib_bottomup {
	public static void main(String[] args) {

    	System.out.println("Please input n-th Fibonacci serial you want to calculate.");
    	Scanner input = new Scanner(System.in);
    	int N = input.nextInt();
    	BigInteger[] memo = new BigInteger[N+1]; //create a BigInteger array. size = N+1

    	memo[1]=new BigInteger("1"); memo[2]=new BigInteger("1");	//set 1st, 2nd element as 1 in BigInteger

    	for(int i=3 ; i<=N ;i++){
    		memo[i]=memo[i-1].add(memo[i-2]);		//use for loop to calculate each fib value 
    	}


    	System.out.println(memo[N]);	//output the last element in array
	}
}