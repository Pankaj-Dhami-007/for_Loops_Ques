public class Ques_2 {
    /*
     * 2. Write a java program to find the sum of first 10 natural numbers.
     * Expected Output :
     * The first 10 natural number is :
     * 1 2 3 4 5 6 7 8 9 10
     * The Sum is : 55
     */
    static int sum(){
        int sum = 0;
     for (int i = 1; i <=10; i++) {
        sum+=i;
     }
     return sum;
    }
    public static void main(String[] args) {
   System.out.println(sum());
    }
}
