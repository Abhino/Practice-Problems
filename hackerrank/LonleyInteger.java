/*Problem: https://www.hackerrank.com/challenges/lonely-integer*/
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LonleyInteger {
	
	static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

	
static void updateMap(int a[]){
	for(int i=0;i<a.length;i++){
		if(map.containsKey(a[i]))
			map.put(a[i],2);
		else
			map.put(a[i], 1);
	}
}

static int lonelyinteger(int[] a) {
		for (Entry<Integer, Integer> e : map.entrySet()) {
			if(e.getValue() == 1)
				return e.getKey();		
	}
return 0;

}

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        updateMap(_a);
        res = lonelyinteger(_a);
        System.out.println(res);
        
    }
}
