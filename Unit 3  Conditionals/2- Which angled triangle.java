                                                            // Unit 3 Conditionals
                                                           // 2- Which angled triangle

// Given the 3 sides of a triangle, find out whether it is acute-angled, right-angled, or obtuse-angled.

// You need to output 1 for acute, 2 for right-angled, and 3 for an obtuse-angled triangle. You can assume that the input values always form a triangle and are valid integers.

// Note:
// A triangle is acute-angled, if twice the square of the largest side is less than the sum of squares of all the sides.

// A triangle is obtuse-angled, if twice the square of its largest side is greater than the sum of squares of all the sides.

// A triangle is right-angled, if twice the square of its largest side is exactly equal to the sum of squares of all the sides.

// Input:
// 3 4 5

// Output:
// 2

// Explanation:
// Since 2x5x5 is equal to 5x5 + 3x3 + 4x4, So this is a right-angled triangle and hence, the answer is 2.

// Input:
// 3 3 3

// Output:
// 1

// Explanation:
// Since 2x3x3 is less than 3x3 + 3x3 + 3x3, So this is an acute-angled triangle and hence, the answer is 1.

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
     Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
         
         int largest = 0;
         int output = 0;
         if (a>=b && a>=c) {
             largest = a;
         }
        else if(b>=a && b>=c){
             largest = b;
         }
         else{
             largest = c;
         }
    int sum = (a*a + b*b + c*c);
    int large = 2*(largest*largest);
        
         if (large < sum){
             output = 1;
         } 
         else if (large > sum){
             output = 3;
         } 
         else{
             output = 2;
         }
         
         System.out.print(output);
	
	}
}