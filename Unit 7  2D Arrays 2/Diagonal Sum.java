                                                            // Unit 7 | 2D Arrays II
                                                           //3- Matrix Diagonal Sum
                                                           
// Given a square matrix mat, return the sum of the matrix diagonals.

// Note: Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

// Input Format
// The first line of input contains integer N which is the number of rows and columns of the square matrix.

// Next N lines contain N spaced integers each.

// Output Format
// Print a single integer which is the sum of diagonals.

// Example 1
// Input

// 3
// 1 2 3
// 4 5 6
// 7 8 9
// Output

// 25 
// Explanation

// The sum is 1+5+9+3+7 = 25. Note that we don't re-count the element mat[1][1] i.e. 5.

// Example 2
// Input

// 4
// 1 1 1 1
// 1 1 1 1 
// 1 1 1 1
// 1 1 1 1
// Output

// 8
// Explanation

// The sum is 1+1+1+1+1+1+1+1 = 8.

// Constraints
// 1 <= N <= 1000

// -100 <= mat[i][j] <= 100

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
