/*Problem: http://www.codechef.com/problems/SUMTRIAN*/

import java.util.Scanner;
class TriangleSum{

  /*Global array to store the input triangle*/
  static int arrayTriangle[][] = new int[100][100];

  /*Function to compute max between two elements in the triangle*/
  public static int max(int x, int y){
    if(x>y)
      return x;
    else
      return y;
  }

  public static int sumTriangle(int x){
    int k,l;

    /*If triangle contains only one element return it*/
    if(x==1)
      return arrayTriangle[0][0];
    
    /*Starting from second last row and passing the highest
    sums to upper rows of the matrix*/
    for(k=x-2;k>=0;k--){
      for(l=0;l<=k;l++){
        arrayTriangle[k][l] += max(arrayTriangle[k+1][l],arrayTriangle[k+1][l+1]);
      }
    }

    /*Top of the triangle now contains the largest sum in the triange*/
    return arrayTriangle[0][0];
  }

  public static void main(String args[]){
    /*Variable elem to record input from Scanner for triangle array*/
    int i,t,k,z,elem;
    Scanner sc = new Scanner(System.in);
    /*Taking "t" test cases as input*/
    t = sc.nextInt(); 
    int x;
    for (i=0;i<t;i++){
      x = sc.nextInt(); 
      for(k=0;k<x;k++){
        for(z=0;z<k+1;z++){
          elem = sc.nextInt(); 
          arrayTriangle[k][z]=elem;
        }
      }
      System.out.println(sumTriangle(x));
    }  
  }
}
  