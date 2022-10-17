                                                            // Unit 9- Practice questions- Loops
                                                           // 3-Second Largest Integer

// In this task, you have to identify the second largest ineteger from input.

// User Task:
// You have to input 5 integers from the user and print the second largest integer from the input

// Example
// Input:

// 5
// 8
// 34
// 54
// 43
// Output:

// 43

import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner sc = new Scanner(System.in);
int arr[]  = new int[5];
int max = arr[0];   
    
    for(int i=0; i<5; i++){
 arr[i] = sc.nextInt();
    
    }
    int ind = 0;
    for(int i=0; i<5; i++){
    
      if(max < arr[i]){
        max = arr[i];
        ind = i;
      }
    }
    arr[ind] = -1000;
    int max2 = arr[0];
    
     for(int i=0; i<5; i++){
    
      if(max2 < arr[i]){
        max2 = arr[i];
        
      }
    }
    System.out.println(max2);   
	}
}