                                                            // Unit 4 | Loops
                                                           // 5- Palindrome Number
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
