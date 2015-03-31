/*Problem: https://www.hackerrank.com/challenges/alternating-characters*/
import java.util.Scanner;

class AlternatingCharacters{

	static int deletions(String s){
		int count=0;
		for (int i=1;i<s.length();i++) {
			if(s.charAt(i) == s.charAt(i-1))
				count++;			
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=0;i<t;i++) {
			String s = sc.next();
			int del = deletions(s);
			System.out.println(del);
		}
		sc.close();
	}
}