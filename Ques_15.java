/*
 12. reverse a number 1234 -> 4321
13. check whether a no. is palindrome or not 
    i.e 12321 -> after reverse -> 12321
 */

import java.util.Scanner;

public class Ques_15 {
    static int reverseNo(int n){
        int rev = 0;
         while (n>0) {
            int rem = n %10;
            rev = rev * 10+ rem;
            n = n/10;
         }
         return rev;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter no ");
          int num = sc.nextInt();
          System.out.println("reverse a number" +num+  " -> "+reverseNo(num));
          if (reverseNo(num) == num) {
            System.out.println("Palindrom No");
          }
          else{
            System.out.println("Not Palindrom No");
          }
    }
}
