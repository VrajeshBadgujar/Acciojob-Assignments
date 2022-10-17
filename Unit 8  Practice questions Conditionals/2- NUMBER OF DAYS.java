                                                            // Unit 8 | Practice questions- Conditionals
                                                           // 2- NUMBER OF DAYS


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