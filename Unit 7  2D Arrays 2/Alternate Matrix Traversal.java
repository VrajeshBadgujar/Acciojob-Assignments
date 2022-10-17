                                                            // Unit 7 | 2D Arrays II
                                                    //1- Alternate Manner Matrix Traversal
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
      int arr[][] = new int [m][n];
// 	  int k = sc.nextInt();	    
      
		for (int i=0; i<m ; i++){
		    for (int j=0; j<n ; j++){
		        
		        arr[i][j] = sc.nextInt();
		    } 
		}
		
		for (int i=0; i<m ; i++){
		    
		    if(i %2 ==0){
		        for (int j=0; j<n ; j++){
		        
		      System.out.print( arr[i][j] + " ");
		    } 
		    }
		    
		  //  System.out.println();
		    else {
		          for (int j=(n-1); j>=0 ; j--){
		        
		        System.out.print( arr[i][j] + " " );
		    }
		    }
		}
		
	}
}