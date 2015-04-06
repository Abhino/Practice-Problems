/*Problem: https://www.hackerrank.com/challenges/identify-smith-numbers*/

import java.util.Scanner;
import java.util.ArrayList;

public class SmithNumbers
{
    static ArrayList<Integer> primeFactors = new ArrayList<Integer>();    
    static ArrayList<Integer> sieve = new ArrayList<Integer>();
    public static void runEratosthenesSieve(int upperBound) {
      int upperBoundSquareRoot = (int) Math.sqrt(upperBound);
      boolean[] isComposite = new boolean[upperBound + 1];
      for (int m = 2; m <= upperBoundSquareRoot; m++) {
            if (!isComposite[m]) {
                  sieve.add(m);
                  for (int k = m * m; k <= upperBound; k += m)
                        isComposite[k] = true;
            }
      }
      for (int m = upperBoundSquareRoot; m <= upperBound; m++)
            if (!isComposite[m]){
              sieve.add(m);
            }
    }

    public static int primeFacts(int number){
      int i = 0,prime;
      while (number!=1) {
              prime = sieve.get(i);
              while(number%prime == 0){
                number = number/prime;
                primeFactors.add(prime);
              }
              i++;
            }      
      int sum=0;
      for (int j=0;j<primeFactors.size();j++){
        prime = primeFactors.get(j);
        if (prime<10)
          sum+=prime;
        else{
          sum+=sumOfDigits(prime); 
        }

        }
      return sum;
    }

    public static int sumOfDigits(int number){
      int sum=0,digit;
      while(number>0){
        digit = number%10;
        sum +=digit;
        number = number/10;
      }  
      return sum;
    }

    public static void main (String[] args) 
    {
        int limit = 10000000;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        runEratosthenesSieve(limit);
        int sum = primeFacts(n);
        int sum2 = sumOfDigits(n);
        //System.out.println("Prime factors:"+primeFactors);                            
        //System.out.println("Sum of prime factors:"+sum);                
        //System.out.println("Sum of digits: "+sum2);                            
        if (sum == sum2)
          System.out.println(1);                
        else
          System.out.println(0);
    }
}