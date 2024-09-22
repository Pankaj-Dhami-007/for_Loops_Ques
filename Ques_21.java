/*
 11.Take a number from user and count it's length and the sum of odd and even numbers 
present in that number then let these 2 results as first and second term
and make fibonnaci series from them till n(the length of that number) term.
    let num=321578        OddSum=16 evenSum=10  digitLen=6
    16 10 26 36 62 98 Ans.
 */
import java.util.*;
public class Ques_21 {
    static void evenOddSum(int n){
        int z =n;
        int rem =0;
        int evenSum =0;
        int oddSum = 0;
     while (z>0) {
        rem = z%10;
        if(rem % 2 == 0){
            evenSum+=rem;
        }
        z/=10;
     }
     while (n>0) {
        rem = n%10;
        if(rem % 2 != 0){
            oddSum+=rem;
        }
        n/=10;
     }
     int a= oddSum;
     int b = evenSum;

     for(int i =0; i< 6; i++){
        System.out.print(a+" ");
        int c = a+b;
        a = b;
        b = c;
     }
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter ANy No :");
    int num = sc.nextInt();
     evenOddSum(num);
  }
}
