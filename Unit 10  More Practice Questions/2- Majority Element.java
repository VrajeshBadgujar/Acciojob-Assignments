                                                            // Unit 10 | More Practice Questions
                                                           // 2- Majority Element
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int arr[] = new int[n];
     int p = arr[0];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    
    for(int i=0; i<n; i++){
      int ct = 0;
      for(int j=0; j<n; j++){
        
      if(arr[i]==arr[j]){
        ct++;
      }
    }
      if(ct > n/2){
       p = arr[i];
      }
	}
     System.out.println(p);
}
}