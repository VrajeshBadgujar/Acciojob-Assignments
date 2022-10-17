                                                            // Unit 7 | 2D Arrays II
                                                    //2- Diagonal Difference!

//  Given a square matrix of size N, calculate the absolute difference between the sums of its diagonals.

// Input Format
// The first line contains a single integer N, the number of rows and columns in the square matrix .

// Each of the next N lines describes a row, and consists of N space-separated integers .

// Output Format
// Print the absolute difference between the sums of the two diagonals of the matrix as a single integer.

// Example 1
// Input

// 3
// 11 2 4
// 4 5 6
// 10 8 -12
// Output

// 15

// Explanation:-

// Sum across the primary diagonal: 11 + 5 + (- 12) = 4

// Sum across the secondary diagonal: 4 + 5 + 10 = 19

// Difference: |4 - 19| = 15

// Example 2
// Input

// 1 2 3
// 4 5 6
// 9 8 9  
// Output

// 2
// Explanation:- The left-to-right diagonal sum =1+5+9=15 .

// The right to left diagonal = 3+5+9 = 17.

// Their absolute difference is |15-17| = 2.

// Constraints
// 1 <= n <= 10^3

// -10^3 <= mat[i][j] <=10^3

// Note: |x| is the absolute value of x (|x| is always non negative for all x)

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