package Ansul;

public class Recursion {
    public static void main(String[] args) {

        int a = factorial(5);
        System.out.println(a);
    }

    public static int factorial(int b) {
        if (b == 1) {
            return 1;
        } else {
            return b * factorial(b - 1);
        }
    }
}




