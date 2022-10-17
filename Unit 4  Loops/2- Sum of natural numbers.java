                                                            // Unit 4 | Loops
                                                           // 2- Sum of natural numbers

//  For an integer N, your task is to calculate the sum of first N natural numbers and print it.

// Input
// The integer N.

// Output
// Print the sum of first N natural numbers.

// Example 1
// Input

// 5
// Output

// 15
// Explanation

// 1+2+3+4+5 = 15

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int hashes = 1;
    int spaces = n-hashes;
    for(int i = 1; i<=n; i++){
      for(int j=0; j<spaces; j++){
        System.out.print(" ");
}
      for(int j=0; j<hashes; j++){
        System.out.print('#');
      }
      System.out.println();
      hashes++;
      spaces--;
      
    }
	}
}