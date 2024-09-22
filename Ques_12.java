/*
 5. take a number from user and count how many odd digits are in that number eg.45897 -> 3
6. take a number from user and count how many even digits are in that number eg.4589 -> 2
 */

import java.util.Scanner;

public class Ques_12 {
    static int countOddDig(int n){
        int count = 0;
       while (n>0) {
         if(n%2 != 0){
          count++;
         }
         n/=10;
       }
       return count;
    }
    static int countEvenDig(int n){
        int count = 0;
        while (n>0) {
          if(n%2 == 0){
           count++;;
          }
          n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter no ");
          int num = sc.nextInt();
          System.out.println("odd digits are "+countOddDig(num));
          System.out.println("Even digits are "+countEvenDig(num));
          sc.close();
    }
}
