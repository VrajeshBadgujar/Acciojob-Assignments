                                                            // Unit 5 | Functions & Arrays
                                                           // 3- Divisible Sum Pairs


import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int arr[] = new int[n];
    int ct = 0;
    
    for(int i=0; i<n; i++){
      arr[i]= sc.nextInt();
    }
    
    for(int i=0; i<n; i++){
      for(int j=i+1; j<n; j++){
       if((arr[i]+arr[j])%k ==0){
//               System.out.println(arr[i] + " "+ arr[j]);
          ct++;
        }
      }
    }
    System.out.println(ct);
  }
}