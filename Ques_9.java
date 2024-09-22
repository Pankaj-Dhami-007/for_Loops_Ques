
/*
 1. take a number from user and find factorial of that
   let num=5  -> 5*4*3*2*1 = 120
 */
import java.util.*;

public class Ques_9 {
    static int factorial(int n) {
        int fact = 1;
        for(int i =1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }
}
