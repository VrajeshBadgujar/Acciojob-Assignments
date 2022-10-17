                                                            // Unit 5 | Functions & Arrays
                                                           //2- Plus Minus


import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
  {Scanner sc = new Scanner(System.in);
   double p=0;
   double ng=0;
   double z=0;
  int n = sc.nextInt();
   int arr[] = new int[n];
   
   for(int i=0; i<n; i++){
     arr[i] = sc.nextInt();
   }
  
   for(int i=0; i<n; i++){
      if(arr[i]>0){
 p++;
      }
     else if(arr[i]<0){
       ng++;
     }
     else{
       z++;
     }
   }
   System.out.println((double)(p/n));
     System.out.println((double)(ng/n));
     System.out.println((double)(z/n));
}
}