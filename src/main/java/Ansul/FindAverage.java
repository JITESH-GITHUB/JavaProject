package Ansul;

import java.util.Arrays;

public class FindAverage {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        float sum = a[0];
        int n = a.length;
        System.out.println(n);
        for (int i = 1; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
        System.out.println("The average of given numbers is : " + sum / n);

        int[] b = {45, 95, 23, 85, 42, 65, 12, 93};
        Arrays.sort(b);
        System.out.println(b[1]);
        int total = b[0];
        for (int i = 1; i < b.length; i++) {
            total = total + b[i];
        }
        System.out.println(total);
    }
}

