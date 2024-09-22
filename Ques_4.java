
/*
 4. Write a program in java to read 10 numbers from keyboard and find their sum and average.  
Test Data :
Input the 10 numbers :
Number-1 :2
...
Number-10 :2
Expected Output :
The sum of 10 no is : 55
The Average is : 5.500000
 */
import java.util.*;

public class Ques_4 {
    static double cal_Avg(int arr[]) {
        int n = arr.length;
        double avg;
        avg = (double)sumNo(arr) / n;
        return avg;

    }

    static int sumNo(int num[]) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Test Data : ");
        int data = sc.nextInt();
        int arr[] = new int[data];
        System.out.println("Input the 10 numbers : ");
        for (int i = 0; i < data; i++) {
            arr[i] = sc.nextInt();
            ;
        }
        System.out.println();

        System.out.println("The sum of 10 no is : "+sumNo(arr));
        System.out.println("The Average is : "+cal_Avg(arr));
    }
}
