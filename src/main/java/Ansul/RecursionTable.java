package Ansul;

public class RecursionTable {
    public static void main(String[] args) {
        table(2, 10);
    }

    public static int table(int b, int c) {
        if (c == 1) {
            return 1;
        } else {
            System.out.println(b + "x" + c + "=" + b * c);
            table(b, c - 1);
        }
        return 1;
    }
}
