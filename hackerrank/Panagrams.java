/*Problem: https://www.hackerrank.com/challenges/pangrams*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

class Panagrams{
	static HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	static{
		int i = 0;
		char alpha;
		for (alpha = 'a'; alpha <= 'z'; alpha++) {
			map.put(alpha, i);
			i++;
		}  
	}

	public static void main(String[] args) throws IOException{
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println(map);
		String s = ob.readLine();
		int A[] = new int[26];
		s = s.replaceAll("\\s+","");
		char ss[] = s.toCharArray();
		int ch;
		for(int i = 0;i<ss.length;i++){
			ch = map.get(Character.toLowerCase(ss[i]));
			A[ch]++;
		}
		for (int j = 0;j<26;j++) {
			System.out.print(A[j]+" ");
		}
		
		int flag = 0;
		for (int j = 0;j<26;j++) {
			if(A[j]==0){
				flag++;
				break;
			}
		}
		if(flag == 0)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}
}