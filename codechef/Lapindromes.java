/*Problem: http://www.codechef.com/problems/LAPIN/*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Arrays;

class Lapindromes{

	static HashMap<String,Integer> map = new HashMap<String,Integer>();
	static{
		int i = 0;
		char alpha;
		for (alpha = 'A'; alpha <= 'Z'; alpha++) {
			map.put(Character.toString(alpha), i);
			i++;
		}  		
	}

	public static int[] counterUpdateFunction(String ss, int A[]){
		int index;
		for(int i=0;i<ss.length();i++){
			index = map.get(ss.substring(i,i+1));
			A[index]+=1;
		}
		return A;
	}	

	public static boolean checkLapindrome(int A[],int B[]){
		for (int i = 0;i<25 ;i++){
			if(A[i]!=B[i])
				return false;
		} 
		return true;
	}

	public static void main(String[] args) throws IOException{
			//System.out.println(map);
			BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
			int[] countLeft = new int[26];
			int[] countRight  = new int[26];			
			int t = Integer.parseInt(ob.readLine());
			for (int i=0;i<t;i++) {				
				String s = ob.readLine();
				s = s.toUpperCase();
				int len = s.length();
				if(len % 2 == 0){
					countLeft = counterUpdateFunction(s.substring(0,len/2),countLeft);
					countRight = counterUpdateFunction(s.substring(len/2,len),countRight);
				}
				else{
					countLeft = counterUpdateFunction(s.substring(0,len/2),countLeft);
					countRight = counterUpdateFunction(s.substring(len/2+1,len),countRight);				
				}
				boolean lapin = checkLapindrome(countLeft,countRight);
				if(lapin == true)
					System.out.println("YES");
				else
					System.out.println("NO");
				Arrays.fill(countLeft,0);				
				Arrays.fill(countRight,0);				
			}
	
/*			System.out.println("countLeft: ");
			for (int i = 0;i<25 ;i++ ) 
					System.out.print(countLeft[i]+" ");
			System.out.println("countRight: ");
			for (int i = 0;i<25 ;i++ )
					System.out.print(countRight[i]+" ");*/				
		}	
}