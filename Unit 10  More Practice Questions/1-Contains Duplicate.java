                                                            // Unit 10 | More Practice Questions
                                                           // 1-Contains Duplicate
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
    int flag = 0;
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
  
    for(int i=0; i<n; i++){   
      for(int j=i+1; j<n; j++){
        if(arr[i] == arr[j]){
         flag++;        
        }      
      }
    }
    
    if(flag>0){
      System.out.println(true);
    }
     else{
          System.out.println(false);
        }
	}
}