public class Ques_20 {
    
/*
 
9. take a ,n,d from user and print the A.P (arithematic progression)    
    let a=10  n=6 d=3
    a  a+d  a+2d a+3d a+4d  a+5d . .
    10  13  16 19 22 25 Ans.

 */
public static void printAP(int a, int n, int d) {
    for (int i = 0; i < n; i++) {
        System.out.print(a + i * d + " ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        int a = 10;  // First term
        int n = 6;   // Number of terms
        int d = 3;   // Common difference

        printAP(a, n, d);
    }
}
