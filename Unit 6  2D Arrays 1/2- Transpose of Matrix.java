                                                            // Unit 6 | 2D Arrays I
                                                           //2- Transpose of Matrix


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[][] = new int [n][n];
		    
      
		for (int i=0; i<n ; i++){
		    for (int j=0; j<n ; j++){
		        
		        a[i][j] = sc.nextInt();
		    } 
    }
       int trans[][] = new int [n][n]; 
      
		for (int i=0; i<n ; i++){
		    for (int j=0; j<n ; j++){
		        
		         trans[i][j]= a[j][i];
           System.out.print(trans[i][j] + " ");
		    }
      System.out.println();
    }
       
     
}}