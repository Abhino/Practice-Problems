package careercup;
/** Problem: From a list of integer intervals, write a function to minimize the number of overlapping 
or consecutive ones.
*/

import java.util.ArrayList;
import java.lang.Integer;
import java.util.ArrayDeque;
import java.util.Collections;
import java.lang.StringBuilder;


class Intervals{

	public static void main( String [] args){
		ArrayList<Pair> pairs = new ArrayList<Pair>();
		pairs.add(new Pair(4, 8));
		pairs.add(new Pair(3, 5));
		pairs.add(new Pair(-1, 2));
		pairs.add(new Pair(10, 12));
		
		System.out.println(minimizeOverlap(pairs));
	}

	static String minimizeOverlap(ArrayList<Pair> pairs){
		ArrayDeque<Integer> result = new ArrayDeque<Integer>();

		if(pairs.size() <= 0) return "[,]";
		
		Collections.sort(pairs);
		StringBuilder str = new StringBuilder();
		Pair first = pairs.remove(0);
		
		str.append("[" + first.getLow());
		int last = first.getHigh();
		int next;
		int highest = 0;
		for(Pair x :pairs){
			
			next = x.getLow();
			if(last < next && Math.abs(next - last) > 1){
				str.append("," + last + "], [" + next);
				last = next;
				highest = x.getHigh();
			}else{
				next = x.getHigh();
				if(last < next){
					last = next;
				}
			}
		}

		str.append("," + highest + "]");
		
		return str.toString();

	}

	static class Pair implements Comparable<Pair>{
		int low;
		int high;

		Pair(int x, int y){
			high = y;
			low = x;
		}

		int getLow(){
			return low;
		}

		int getHigh(){
			return high;
		}

		public String toString(){
			return "[" + low + "," + high + "]";
		}

		public int compareTo(Pair o){
			
			if(low < o.getLow()) return -1;
			if(low > o.getLow()) return 1;

			return 0;
		}
	}
}