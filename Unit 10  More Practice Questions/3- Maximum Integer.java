                                                            // Unit 10 | More Practice Questions
                                                           // 3- Maximum Integer
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    
    if(n1 >= n2 && n1>= n3){
       System.out.println(n1);
    }
    else if(n2 >= n1 && n2>= n3){
       System.out.println(n2);
    }
    else{
      System.out.println(n3);
    }
	}
}