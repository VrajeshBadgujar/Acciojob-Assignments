                                                            // Unit 4 | Loops
                                                           // 5- Palindrome Number

//  Given a number N, you need to check whether the given number is Palindrome or not. A number is said to be Palindrome when it reads the same from backward as forward.

// Input
// The line inputs N.

// Output
// You need to print "true" if the number is palindrome otherwise "false" (without quotes).

// Example 1
// Input

// 5
// Output

// true 
// Example 2
// Input

// 121
// Output

// true 
// Constraints:
// 1 <= N <= 9999

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int copy = n;
    int reverse=0;
    
    while(copy!=0){
      
    int digit = copy%10;
    copy = copy/10;
    reverse = reverse * 10 + digit;
    }
    if(reverse==n){
      System.out.println("true");
    }
    else{
      System.out.println("false");
    }
       
    }
	}
