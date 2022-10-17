                                                            // Unit 7 | 2D Arrays II
                                                    //1- Alternate Manner Matrix Traversal

// 	Given a 2D matrix mat of M rows and N columns , the task is to print the 2D matrix in alternate manner. Alternate manner denotes that the elements of the odd rows (first row, third row etc) will be printed from left to right and the elements of the even rows(second row, fourth row, etc) will be printed from right to left.

// For example, if M=3, then first line will contain all the elements of the first row of the matrix from left to right. Second line will contain all the elements of the second row from right to left. Third line will contain all the elements of the third row from left to right.

// Input Format
// The first line contains two integers, M and N, represent the number of rows and columns respectively.

// The next M lines contain N space separated integers, denoting the matrix.

// Output Format
// There will be 1 line with all the elements of the matrix after performing the alternate traversal. The elements will be separated by space.

// Examples
// Input

// 2 2
// 1 2
// 2 3
// Output

// 1 2 3 2
// Explanation

// There are 2 rows in the matrix. In the first row from left to right the elements are :- 1 2. As this is an odd row, they will be printed from left to right. In the second row, from left to right the elements are :- 2 3. As this is an even row, elements will be printed from right to left.

// Input

// 3 3
// 7 2 3
// 2 3 4
// 5 6 1
// Output

// 7 2 3 4 3 2 5 6 1
// Explanation

// There are 3 rows in the matrix. In the first row from left to right the elements are :- 7 2 3. As this is an odd row, they will printed from left to right. In the second row from left to right the elements are :- 2 3 4. As this is an even row elements, will be printed from right to left. In the third row, from left to right the elements are :- 5 6 1. As this is an odd row they will printed from left to right.

// Constraints
// 1<=M<=10^4

// 1<=N<=10^4

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      int n = sc.nextInt();
      int arr[][] = new int [m][n];
// 	  int k = sc.nextInt();	    
      
		for (int i=0; i<m ; i++){
		    for (int j=0; j<n ; j++){
		        
		        arr[i][j] = sc.nextInt();
		    } 
		}
		
		for (int i=0; i<m ; i++){
		    
		    if(i %2 ==0){
		        for (int j=0; j<n ; j++){
		        
		      System.out.print( arr[i][j] + " ");
		    } 
		    }
		    
		  //  System.out.println();
		    else {
		          for (int j=(n-1); j>=0 ; j--){
		        
		        System.out.print( arr[i][j] + " " );
		    }
		    }
		}
		
	}
}