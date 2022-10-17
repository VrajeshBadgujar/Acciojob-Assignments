                                                            // Unit 5 | Functions & Arrays
                                                           // 5- A Contest


import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
  {Scanner sc =new Scanner(System.in);
  int n = sc.nextInt();
  int arr[] = new int[n];
  int k = sc.nextInt();
  int ct = 0;
  
  for(int i=0; i<n; i++){
    arr[i] = sc.nextInt();
  }
  
  for(int i=0; i<n; i++){

      if(arr[i]>= arr[k-1]){
        ct++;
      }

  }
  System.out.println(ct);
} 
}