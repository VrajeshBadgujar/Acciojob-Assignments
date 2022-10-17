                                                            // Unit 8 | Practice questions- Conditionals
                                                           // 3- NUMBER OF DAYS

// Given the number of the month, your task is to calculate the number of days present in the particular month.

// Note:- Consider non-leap year.

// Input Format
// An integer M, denoting the number of the month.

// Output Format
// Return the number of days in the month corresponding to the given number. Consider a non-leap year.

// Constraints
// 1 <= M <= 12

// Example
// Input

// 1
// Output

// 31

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    
    if(m==2){
      System.out.println(28);
    }
   else if(m%2==0){
      System.out.println(30);
    }
    else{
      System.out.println(31);
    }
    
	}
}