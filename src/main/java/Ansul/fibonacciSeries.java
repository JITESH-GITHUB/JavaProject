package Ansul;

public class fibonacciSeries {
    public static void main(String[] args) {
        int a = 2;
        System.out.println("The table of 2 is :");
        for (int i = 1; i <= 10; i++) {
            int n = a * i;
            System.out.println(a + "x" + i + "=" + n);
        }

        int j = 0, k = 1, l;
        System.out.print(j + "," + k);
        for (int i = 0; i < 8; i++) {
            l = j + k;
            j = k;
            k = l;
            System.out.print("," + l);
        }
    }
}
