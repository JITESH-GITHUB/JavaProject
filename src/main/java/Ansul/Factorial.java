package Ansul;

public class Factorial {
    public static void main(String[] args) {

        int num = 1;

        System.out.print("The factorial of 5 is : ");
        for (int i = 5; i > 1; i--) {

            num = num * i;
        }
        System.out.println(num);
    }
}
