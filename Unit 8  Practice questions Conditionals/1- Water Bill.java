                                                            // Unit 8 | Practice questions- Conditionals
                                                           // 1- Water Bill
                                                           
// In this task, you need to identify the water bill for a household

// User Task:
// You have to input the total liter of water used by a house and output the total water bill. The water bill is calculated as follows:

// For first 100 litres: Rs. 15 per litre

// For next 100 litres: Rs. 14 per litre

// After 200 litres: Rs. 12 per litre

// Example
// Input: 105

// Output: 1570


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