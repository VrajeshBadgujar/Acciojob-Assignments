                                                            // Unit 3 Conditionals
                                                           // 1- Leap Year
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int isleap=1;
  
    if (input%4==0){
       if(input%100 == 0){
           if(input%400!=0){
               isleap = 0;
           }
           else{
               isleap=1;
           }
       }
       
       else{
           isleap=1;
       }
}
    else{
      isleap = 0;
}
    
    System.out.print(isleap);
}
}