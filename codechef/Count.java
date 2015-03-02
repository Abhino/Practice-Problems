package codeChef;

/**
 * http://www.codechef.com/problems/MAXCOUNT
 * */
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Count {
	static Scanner sc = new Scanner(System.in);

	public static int MaxPrint(int n){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0;i<n;i++){
			int elem = sc.nextInt();
			if(map.containsKey(elem))
				map.put(elem, map.get(elem) + 1);
			else
				map.put(elem, 1);				
		}
		Entry<Integer, Integer> maxEntry = null;

		for(Entry<Integer, Integer> entry : map.entrySet()) {
		    if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
		        maxEntry = entry;
		    }
		}
		System.out.println(maxEntry.getKey()+" "+maxEntry.getValue());
		return 0;
	}
	
	public static void main(String args[]){
		int N,t;
		t = sc.nextInt();
		while(t!=0){
			try {
				N = sc.nextInt();
				MaxPrint(N);
				t--;
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		sc.close();
	}
}
