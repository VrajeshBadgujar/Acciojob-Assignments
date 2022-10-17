                                                            // Unit 4 | Loops
                                                           // 3- Armstrong Number Finder
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int hashes = 1;
    int spaces = n-hashes;
    for(int i = 1; i<=n; i++){
      for(int j=0; j<spaces; j++){
        System.out.print(" ");
}
      for(int j=0; j<hashes; j++){
        System.out.print('#');
      }
      System.out.println();
      hashes++;
      spaces--;
      
    }
	}
}