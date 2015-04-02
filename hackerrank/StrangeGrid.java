/*Problem: https://www.hackerrank.com/challenges/strange-grid*/

import java.util.Scanner;
import java.util.*;
import java.math.*;

class StrangeGrid{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rows = sc.next();
		BigInteger zero = new BigInteger("0");
		BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		BigInteger ten = new BigInteger("10");
	    BigInteger r = new BigInteger(rows);
		String cols = sc.next();
		BigInteger c = new BigInteger(cols);
		BigInteger sum = zero;
	    BigInteger mod = r.mod(two);	
	    BigInteger div = zero;	
		if(mod.compareTo(zero)==0){
			sum = sum.add(one);
			div = r.subtract(one);
			div = div.divide(two);
			div = div.multiply(ten);
			sum = sum.add(div);
		}
		else{
			div = r;
			div = div.divide(two);
			div = div.multiply(ten);
			sum = sum.add(div);
		}
	    BigInteger colsum = zero;
	    c = c.subtract(one);	
	    colsum = two.multiply(c);
		sum = sum.add(colsum);		
		System.out.println(sum);
		sc.close();		
	}
}