package Ansul;

public class EvenOddNumbers {
    public static void main(String[] args) {
        float num = 18.75f;
        int x = (int) num % 2;
        if (x == 0) {
            System.out.println(num + " :Number is Even");
            System.out.println(num % 2);
        } else {
            System.out.println(num + " :Number is Odd");
            ////  System.out.println( num%2);
        }
        String str = "10";
        // int b= Integer.parseInt(str);
        int a = 10;
        String b = "" + a;
        System.out.println(b);
        System.out.println(b + a);

    }
}
