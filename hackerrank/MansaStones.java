import java.io.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

public class MansaStones {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t,n,a,b;
        t = sc.nextInt();
        
          for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            /*To Store the set of all possible distances to last stone */
            HashSet<Integer> lastStoneList = new HashSet<Integer>();

            /*If n = 1 then it itself is the last stone*/
            if (n == 1) {
                lastStoneList.add(0);
            } 
            else {
                for (int k = 0; k < n; k++) {
                	/*To evaluate every possible final distance*/
                    int dist =a*k+b*(n-1-k);
                    /*Since its a hashset no duplicate values will be added*/
                    lastStoneList.add(dist);
                }
            }
            /*Sorting the set using a Arraylist*/
            ArrayList<Integer> sortedList = new ArrayList<Integer>(lastStoneList);
			Collections.sort(sortedList);
            System.out.println(sortedList.toString().replace(",", "").replace("[", "").replace("]", ""));
        }
        sc.close();
     }
}