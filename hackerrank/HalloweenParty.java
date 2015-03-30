/* Problem: https://www.hackerrank.com/challenges/halloween-party*/

import java.util.Scanner;
import java.math.*; 

class HalloweenParty{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//double piece,div,div2;
		int t = sc.nextInt();
		for (int i=0;i<t;i++){
			String n = sc.next();
		    BigInteger p = new BigInteger(n);
		    BigInteger mod = p.mod(new BigInteger("2"));
		    if(mod.compareTo(new BigInteger("0"))==0){
		    	BigInteger div = p.divide(new BigInteger("2"));
	    		div = div.pow(2);
				System.out.println(div);
			}
			else{
		    	BigInteger div2 = p.divide(new BigInteger("2"));
		    	BigInteger div3 = p.subtract(div2);
	    		BigInteger div4 = div2.multiply(div3);
				System.out.println(div4);
			}

		}
		sc.close();
	}
}