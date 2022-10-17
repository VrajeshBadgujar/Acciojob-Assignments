                                                            // Unit 8 | Practice questions- Conditionals
                                                           // 1- Water Bill


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int bill = sc.nextInt();
      
      if(bill<=100){
        bill = bill *  15;
      }
      else if(bill >100 & bill <=200){
        bill =( 100 * 15) + (bill-100) * 14;
      }
      else{
        bill = (100 *15) + (100 * 14) + (bill-200)*12;
     }
      
      System.out.println(bill);
    }
}