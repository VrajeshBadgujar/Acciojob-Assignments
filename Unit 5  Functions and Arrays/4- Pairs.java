                                                            // Unit 5 | Functions & Arrays
                                                           // 4- Pairs


import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception{
 Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     int k = sc.nextInt();
    int arr[]= new int[n];
    
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    int count=0;
    for(int i=0; i<n; i++){
      for(int j=i+1;j<n;j++){
        if((arr[i]-arr[j])==k || (arr[j]-arr[i])==k )
          count++;
      }
    }
    System.out.println(count);
}
}