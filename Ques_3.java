import java.util.*;
/*
 3. Write a program in java to display n terms of natural number and their sum. 
Test Data : 7
Expected Output :
The first 7 natural number is :
1 2 3 4 5 6 7
The Sum of Natural Number upto 7 terms : 28
 */
public class Ques_3 {
    static int sumNo(int n){
         int sum = 0;
         for(int i =1; i<=n; i++){
            sum+=i;
         }
         return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Test Data : ");
         int data = sc.nextInt();
         System.out.print("The first 7 natural number is :");
         for(int i=1; i<=data; i++){
             System.out.print(i+" ");
         }
         System.out.println();
         int x = sumNo(data);
    System.out.printf("The Sum of Natural Number upto %d terms is %d .",data, x);
    }
}
