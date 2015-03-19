/*Problem: https://www.hackerrank.com/challenges/gem-stones*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

class gemStones{

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
		int a[] = new int[26];		
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(ob.readLine());
		for (int k=0;k<t;k++) {
			String s = ob.readLine();
			s = s.toLowerCase();	
			int len = s.length(),index=0;
			char[] ch = s.toCharArray();
		    Set<Character> charSet = new LinkedHashSet<Character>();
		    for (char c : ch) {
		        charSet.add(c);
		    }

		    StringBuilder sb = new StringBuilder();
		    for (Character character : charSet) {
		        sb.append(character);
		    }
		    s = sb.toString();			    
			char[] ch2 = s.toCharArray();	    
			for (int i = 0;i<ch2.length;i++){
				index = map.get(ch2[i]);
				a[index]++;
			}
		}
		int count = 0;
		for (int i = 0;i<26;i++)
			if(a[`i] == t)
				count++;
		System.out.print(count);			
	}
}