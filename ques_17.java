/*
17.Find and print all the factors of a given number using a for loop.
18.Calculate the sum of the factors of a given number using a for loop.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ques_17 {
    static ArrayList<Integer> findFactor(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =1; i<=n; i++){
            if(n % i == 0){
                list.add(i);
            }
        }
        return list;
    }
    static int factorsSum(ArrayList<Integer> list){
        int sum =0;
          for(int i=0; i< list.size(); i++){
             sum+= list.get(i);
          }
          return sum;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter no ");
          int num = sc.nextInt();
          System.out.println("Factors are :"+findFactor(num));
          ArrayList<Integer> factors = findFactor(num);
          int sumOfFactors = factorsSum(factors);
          System.out.println("Sum is :"+sumOfFactors);
    }
}
