
/*
  6. Write a program in java to display the multiplication table of a given integer.  
Test Data :
Input the number (Table to be calculated) : 15
Expected Output :
15 X 1 = 15
...
...
15 X 10 = 150

 */
import java.util.*;

public class Ques_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number (Table to be calculated) : ");
        int n = sc.nextInt();
        System.out.println("Expected Output :");
        for(int i =1; i<=10; i++){
            System.out.println(n+" X "+i+" = " +i*n);
        }
    }
}
