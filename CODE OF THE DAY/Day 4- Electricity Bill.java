							                      // Code Of The Day
							                     // Day 4- Electricity Bill
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc  =new Scanner(System.in);
    int n = sc.nextInt();
    
    if(n <= 50){
      System.out.print(n * 5);          
    }
    if( n> 50 && n<= 150){
       System.out.print((50 * 5) + (n-50) * 7);    
    }
    if(n >150 && n<=250 ){
      int c = (50 * 5) + (100 * 7) + (n-150) * 9;
       System.out.print(c);
    }
    if( n>250 ){
      int d = (50 * 5) + (100 * 7) + (100 * 9) + (n - 250) * 12;
       System.out.print(d);
    }
    
    
	}
}