package Ansul;

public class MobileAutomation {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 10;
        System.out.println("Numbers before swapping");
        System.out.println("First Number is " + firstNumber);
        System.out.println("Second Number is " + secondNumber);

        int thirdNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;

        System.out.println("Numbers after swapping");
        System.out.println("First Number is " + firstNumber);
        System.out.println("Second Number is " + secondNumber);


        String a = "=10";
        a = a.replaceAll("=", "");
        System.out.println(a);
        int v = Integer.parseInt(a);
        int b = 10;
        System.out.println(v + b);


    }
}