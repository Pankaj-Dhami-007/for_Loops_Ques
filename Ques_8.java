/*
 * 8. Write a program in java to display the n terms of odd natural number and their sum .  
Test Data
Input number of terms : 10
Expected Output :
The odd numbers are :1 3 5 7 9 11 13 15 17 19
The Sum of odd Natural Number upto 10 terms : 100

 */
import java.util.*;
public class Ques_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of terms : ");
        int n = sc.nextInt();
        System.out.println("Expected Output : ");

        for(int i =1; i<=n; i++){
            System.out.print(2*i-1+" ");
        }
    System.out.println();
        int sum =0;
        for(int i =1; i<=n; i++){
            sum = sum+(2*i-1);
        }
        System.out.println("The Sum of odd Natural Number upto 10 terms : "+sum);
    }
}
