                                                            // Unit 4 | Loops
                                                           // 1- Staircase

//  In this question, you need to write a program that prints a staircase of size N.

// This is a staircase of size n=4:

//        #
//       ##
//      ###
//     ####
// Its base and height are both equal to n. It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

// Input Format
// A single integer, n, denotes the size of the staircase.

// Output Format
// Print a staircase of size n using # symbols and spaces.

// Note: The last line must not have spaces in it.

// Example 1
// Input

// 6
// Output

//         #
//        ##
//       ###
//      ####
//     #####
//    ######
// Explanation

// The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n=6. You might notice, first line has 5 spaces (n-1) followed by 1 # and the last line has 0 spaces (n-n) and 6 # (n)

// Example 1
// Input

// 5
// Output

//         #
//        ##
//       ###
//      ####
//     #####
// Explanation

// The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n=5. You might notice, first line has 4 spaces (n-1) followed by 1 # and the last line has 0 spaces (n-n) and 5 # (n)

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