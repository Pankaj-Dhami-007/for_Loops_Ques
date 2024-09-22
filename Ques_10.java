/*
 2. print fibonnaci series let n=10
    0 1 1 2 3 5 8 13 21 34
 */

import java.util.Scanner;

public class Ques_10 {
    static void fibbo(int n){
        int a =0;
        int b =1;
        for(int i =1; i<=n; i++){
            System.out.print(a+" ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("ENter no ");
        int num = sc.nextInt();
        fibbo(num);
    }
}
