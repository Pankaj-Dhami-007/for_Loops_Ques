/*
 4. take a number from user and count how many digits are in that number eg.4589 -> 4
 */
import java.util.*;
public class Ques_11 {
    static int countDigit(int n){
        int count =0;
        while (n>0) {
            count++;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter no ");
          int num = sc.nextInt();
          System.out.println(countDigit(num));
    }
}
