/*
 10. take a number from user and check whether it is a prime number or not
 */

import java.util.Scanner;

public class Ques_14 {
    static void isPrime(int n){
        int count =0;
        for(int i =1; i<=n; i++){
            if(n % i == 0){
               count++;
            }
        }
        if(count == 2){
            System.out.println("Prime no");
        }
        else{
            System.out.println("Not Prime no");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter no ");
          int num = sc.nextInt();
          isPrime(num);
    }
}
