                                                            // Unit 5 | Functions & Arrays
                                                           //1- Circular Array Rotation


import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
  {      Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int k = sc.nextInt();
    int q = sc.nextInt();

  for(int i=0; i<n; i++){
     arr[i] = sc.nextInt();
  }

for (int i=1; i<=k; i++) {
    int t = arr[n-1];
    
   for(int j=n-2; j>=0; j--){
   
     arr[j+1] = arr[j];
   }
     arr[0]= t;
}
 
 for (int i=0; i<q; i++) {
     int index = sc.nextInt();
     System.out.println(arr[index]);
     
 }
   
  }
}