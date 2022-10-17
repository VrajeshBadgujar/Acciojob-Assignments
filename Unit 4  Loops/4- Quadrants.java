                                                            // Unit 4 | Loops
                                                           // 4- Quadrants
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