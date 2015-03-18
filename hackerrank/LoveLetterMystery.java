/*Problem: https://www.hackerrank.com/challenges/the-love-letter-mystery*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

class LoveLetterMystery{
	static HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	static{
		int i = 0;
		char alpha;
		for (alpha = 'a'; alpha <= 'z'; alpha++) {
			map.put(alpha, i);
			i++;
		}  
	}
	public static void main(String[] args) throws IOException {
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(ob.readLine());
		for(int k = 0;k<t;k++){
			String s = ob.readLine();
			s = s.toLowerCase();
			int len = s.length();
			int a[] = new int[len];
			char ch[] = s.toCharArray();
			for (int i = 0;i<len;i++) {
				a[i] = map.get(ch[i]);
				}
			int diff = 0;
			for(int i = 0;i<len/2;i++){
				diff+=Math.abs(a[i]-a[len-1-i]);
			}
			System.out.println(diff);		
		}
	}
}