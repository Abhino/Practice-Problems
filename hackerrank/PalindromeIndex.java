/*Problem: https://www.hackerrank.com/challenges/palindrome-index*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

class PalindromeIndex{

	static HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	static{
		int i = 0;
		char alpha;
		for (alpha = 'a'; alpha <= 'z'; alpha++) {
			map.put(alpha, i);
			i++;
		}  
	}

	static boolean isPalindrome(String s) {
	  int n = s.length();
	  for (int i=0;i<(n / 2) + 1;++i) {
	     if (s.charAt(i) != s.charAt(n - i - 1)) {
	         return false;
	     }
	  }
	  return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(ob.readLine());
		for (int k=0;k<t;k++) {
			String s = ob.readLine();
			s = s.toLowerCase();
			if(isPalindrome(s))
				System.out.println(-1);
			else{
				int len = s.length();
				int a[] = new int[len];
				char ch[] = s.toCharArray();
				for (int i = 0;i<len;i++)
					a[i] = map.get(ch[i]);
				int diff = 0,index1 = 0,index2 = 0;
				for(int i = 0;i<len/2;i++){
					diff=Math.abs(a[i]-a[len-1-i]);
					if(diff!=0){
						index1 = i;
						index2 = len-1-i;
						break;
					}
				}
				StringBuffer sb = new StringBuffer(s); 
				sb.deleteCharAt(index1); 
				if(isPalindrome(sb.toString()))
					System.out.println(index1);
				else{
					StringBuffer sb2 = new StringBuffer(s); 
					sb2.deleteCharAt(index2); 
					if(isPalindrome(sb2.toString()))
						System.out.println(index2);
				}
			}
		}
	}
}