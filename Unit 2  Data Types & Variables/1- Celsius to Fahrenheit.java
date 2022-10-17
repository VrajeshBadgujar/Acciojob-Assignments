                                                            // Unit 2  Data Types & Variables
                                                           // 1- Celsius to Fahrenheit
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