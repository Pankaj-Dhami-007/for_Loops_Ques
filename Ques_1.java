/*
1. Write a program in java to display the first 100 natural numbers.  
Expected Output :
1 2 3 4 5 6 7 8 9 10 . . .
 */
/**
 * Ques_1
 */
public class Ques_1 {
    static void printNum(){
     for (int i = 1; i <= 10; i++) {
        System.out.print(i+" ");
     }
    }

    public static void main(String[] args) {
        printNum();
    }
}