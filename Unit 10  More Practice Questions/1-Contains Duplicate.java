                                                            // Unit 10 | More Practice Questions
                                                           // 1-Contains Duplicate

//  Given an array 'arr' with 'n' positive integers. Find if the array contains any duplicates.

// Input Format
// The first line of input contains the integer n.

// The last line contains n spaced integers.

// Output Format
// For each test case print "true" without quotes if duplicates are present or print "false" without quotes if duplicates are not present.

// Example 1
// Input

// 4
// 1 2 3 1
// Output

// true
// Explanation

// 1 is duplicate here.

// Example 2
// Input

// 4
// 1 2 3 4
// Output

// false
// Explanation

// No duplicate present.

// Constraints
// 1 <= n <= 10000

// 0 <= arr[i] <= 100000

import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int flag = 0;
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
  
    for(int i=0; i<n; i++){   
      for(int j=i+1; j<n; j++){
        if(arr[i] == arr[j]){
         flag++;        
        }      
      }
    }
    
    if(flag>0){
      System.out.println(true);
    }
     else{
          System.out.println(false);
        }
	}
}