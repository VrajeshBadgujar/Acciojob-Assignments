							                      // Code Of The Day
							                     // Day 5- Substitution cipher
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) {
		// your code here
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    for(int i=0; i<s.length(); i++){
       
        System.out.print(s.charAt(i)-65);
    }
    
	}
}