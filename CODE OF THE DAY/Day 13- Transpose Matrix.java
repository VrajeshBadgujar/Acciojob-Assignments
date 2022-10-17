							                      // Code Of The Day
							                     // Day 13- Transpose Matrix
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);
       int m = sc.nextInt(); 
        int n = sc.nextInt(); 
       int arr[][] = new int[m][n];
       
       for (int i=0;i<arr.length ;i++ ){
           for (int j=0; j<arr[0].length; j++){
               
               arr[i][j] = sc.nextInt();
               
           } 
       } 
       
       int trans[][] = new int[n][n];
       
       for (int i=0;i<arr.length ;i++ ){
           for (int j=0; j<arr[0].length; j++){
               
                trans[j][i]  = arr[i][j];
               
           } 
       } 
       
        for (int i=0;i<arr.length ;i++ ){
           for (int j=0; j<arr[0].length; j++){
               
                 System.out.print(trans[i][j] + " ");
               
           }
           System.out.println();
       }
	}
}