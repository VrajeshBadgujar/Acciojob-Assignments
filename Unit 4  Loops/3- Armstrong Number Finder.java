                                                            // Unit 4 | Loops
                                                           // 3- Armstrong Number Finder
//  Armstrong Number Finder
// Given a number N, you need to check whether the given number is Armstrong number or not. Now what is Armstrong number let us see below:

// A number is said to be Armstrong if it is equal to sum of the cube of its digits.

// Input
// A single integer N.

// Output
// You need to return 1 if the given number N is an Armstrong number otherwise 0.

// Sample Input:
// 1

// Sample Output:
// 1

// Sample input
// 150

// Sample Output:
// 0

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