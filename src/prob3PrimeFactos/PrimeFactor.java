package prob3PrimeFactos;

import java.math.BigInteger;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */


public class PrimeFactor {
	public static void main(String [] args){
		BigInteger  num = new BigInteger ("600851475143");
		
		int [] store = new int[1000];
		System.out.println();

			
		for (int i=2; i<1000;i++){
			if (store[i]==0){
				for(int j = i;j<1000;j=j+i){
					store[j]=j;
					System.out.println(store[j]);
				}
				
			}
		}
		
		
	}
	

}
