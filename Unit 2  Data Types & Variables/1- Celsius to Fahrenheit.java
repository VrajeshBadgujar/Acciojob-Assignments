                                                            // Unit 2  Data Types & Variables
                                                           // 1- Celsius to Fahrenheit

//                                                            Given the temperature of a city in celsius, your task is to convert the temperature to Fahrenheit and return it.

// Note: It is guaranteed that the temperature in celsius, C, will be a multiple of 5.

// Input Format
// An integer C, represents the temperature in Celsius which is a multiple of 5.

// Output Format
// Return an integer containing the converted temperature in Fahrenheit.

// Example 1
// Input

// 25
// Output

// 77
// Explanation

// 25 * 9/5 + 32 = 77

// Example 2
// Input

// -40
// Output

// -40
// Explanation

// -40 * 9/5 + 32 = -40

// Constraints
// -1000 <= C <= 1000

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
    	Scanner input = new Scanner(System.in);
      int cel = input.nextInt();

    int f=( cel*9/5) + 32;
    System.out.println(f);
	}
}