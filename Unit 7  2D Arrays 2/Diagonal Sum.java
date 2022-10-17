                                                            // Unit 7 | 2D Arrays II
                                                           //3- Matrix Diagonal Sum

import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int arr[][] = new int[n][n];
   int sa = 0;
   int sb = 0;
   int m = 0;
    
   for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
    arr[i][j] = sc.nextInt();
   }
   }
   
		 for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
       
          if(i == j){
           sa = sa + arr[i][j];
          }
          else if((i+j)==(n-1)){
           sb = sb + arr[i][j];
          }

   }
   }

  System.out.println(sa + sb);
   
	}
}
