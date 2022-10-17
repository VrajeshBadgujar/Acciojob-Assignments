                                                            // Unit 3 Conditionals
                                                           // 2- Which angled triangle
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