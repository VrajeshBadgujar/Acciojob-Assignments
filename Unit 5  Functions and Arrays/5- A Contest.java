                                                            // Unit 5 | Functions & Arrays
                                                           // 5- A Contest
                                                           
// A Contest is held and a total of N participants took part in the contest. You are already given the scores of the participants in the form of an array (of size N).

// The contestant who has a score greater than or equal to the score of the K-th Participant (where K<=N) will advance to the next round, as long as the contestant has a positive score.

// Calculate the total number of participants who will advance to the next round.

// Input
// The first line of the input contains two integers N and K separated by a single space.

// The second line contains N space-separated integers a1, a2, ..., an, where a[i] is the score earned by the participant who got the i-th place. The given sequence is non-increasing, i.e., for all i from 1 to n - 1 the following condition is fulfilled: a[i] ≥ a[i + 1].

// Output
// Print the number of participants who advance to the next round.

// Examples
// Input
// 8 5
// 10 9 8 7 7 7 5 5
// Output
// 6

// Input
// 4 2
// 0 0 0 0
// Output
// 0

// Explanation
// In the first example, the participant in the 5th place earned 7 points. As the participant in 6th place also earns 7 points, there are 6 advancers.

// In the second example, nobody got a positive score.

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