/*
 3.check whether a no. is 3 digit armstrong or not i.e
    153 = 1*1*1 + 5*5*5 + 3*3*3 => 153
 */

import java.util.Scanner;

public class Ques_18 {
    static void isArmstrongNo(int n){
        int p = n;
        int count = 0;
        while (p>0) {
            count++;
            p/=10;
        }

        int z = n;
        int rem =0;
        double sum =0;
        while (z>0) {
            rem = z%10;
            sum+= Math.pow(rem, count);
            z/=10;
        }
        if(sum == n){
            System.out.println("Armstrong No :");
        }
        else{
            System.out.println("Not Armstrong No");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check whether a No armstrong or not :");
        System.out.println("Enter a no : ");
        int n = sc.nextInt();
        isArmstrongNo(n); 
    }
}
