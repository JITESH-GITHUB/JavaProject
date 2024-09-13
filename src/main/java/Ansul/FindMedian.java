package Ansul;

public class FindMedian {
    public static void main(String[] args) {

        int[] a = {567, 2, 23, 48, 2, 64, 17};
        if (a.length % 2 == 0) {
            System.out.println("Even series");
            int c = a.length / 2;

            System.out.println(c);
            float d = a[c - 1];
            System.out.println(d);
            float v = d + a[c];
            System.out.println(v / 2);
        } else {
            System.out.println("Odd series");

            int b = a.length / 2;
            System.out.println(b);
            int i = a[b];
            System.out.println(i);
        }

    }
}
