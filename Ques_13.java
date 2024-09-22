/*
 7. take a number from user and sum of the even digits in that number eg.4589 -> 12
8. take a number from user and sum of the odd digits in that number eg.4589 -> 14
 */

import java.util.Scanner;

public class Ques_13 {
    static int evenSum(int n){
        int lastDig =0;
        int sum = 0;
      while (n>0) {
        lastDig = n % 10;
        if (lastDig % 2 == 0) {
            sum+= lastDig;
        }
        n/=10;
      }
      return sum;
    }
    static int oddSum(int n){
        int lastDig =0;
        int sum = 0;
      while (n>0) {
        lastDig = n % 10;
        if (lastDig % 2 != 0) {
            sum+= lastDig;
        }
        n/=10;
      }
      return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter no ");
          int num = sc.nextInt();
          System.out.println("Even digits are "+evenSum(num));
          System.out.println("Odd digits are "+oddSum(num));
          sc.close();
    }
    
}
