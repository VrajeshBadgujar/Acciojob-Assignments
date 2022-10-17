                                                            // Unit 7 | 2D Arrays II
                                                    //2- Diagonal Difference!

import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int arr[][] = new int[n][n];
   int sa = 0;
   int sb = 0;
   
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
           if((i+j)==(n-1)){
           sb = sb + arr[i][j];
          }
   }
   }

   if((sa-sb) >0){
   System.out.println(sa - sb);
   }
   else{
      System.out.println(sb - sa);
   }
	}
}