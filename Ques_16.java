/*
 14.Write a java program to print all the perfect numbers from 1 to 1000 eg. 28 => 1+2+4+7+14 =28
 */
public class Ques_16 {
    public static boolean isPerfect(int number) {
        int sum = 0;

        // Find all divisors of the number and calculate their sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000 are:");
        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
}
