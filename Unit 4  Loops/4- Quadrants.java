                                                            // Unit 4 | Loops
                                                           // 4- Quadrants

// A common problem in mathematics is to determine which quadrant a given point lies in. There are four quadrants, numbered from 1 to 4, as shown in the diagram below:

// image

// For example, the point A, which is at coordinates (12,5) lies in quadrant 1 since both its x and y values are positive, and point B lies in quadrant 2 since its x value is negative and its y value is positive.

// Your job is to take a point and determine the quadrant it is in. You can assume that neither of the two coordinates will be 0.

// Input
// The input consists of two lines.

// The first line of input denotes the x coordinate.

// The second line of input denotes the y coordinate.

// Output
// Output the quadrant number (1, 2, 3 or 4) for the point (x,y).

// Example 1
// Input

// 10
// 6
// Output

// 1
// Example 2
// Input

// 9
// -13
// Output

// 4

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{ 
    Scanner sc= new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if(a> 0 && b>0){
      System.out.print(1);
    }
    else if(a< 0 && b<0){
      System.out.print(3);
    }
    else if(a> 0 && b<0){
      System.out.print(4);
    }
    else{
      System.out.print(2);
    }
    
	}
}