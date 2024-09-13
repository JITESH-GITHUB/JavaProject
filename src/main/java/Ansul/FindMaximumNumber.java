package Ansul;

import java.util.Arrays;

public class FindMaximumNumber {
    public static void main(String[] args) {
        int[] a = {56, 85, 32, 45, 456, 74};
        int max = a[0];
//        System.out.println("Print the numbers stored in array :");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
        for (int i = 1; i < a.length; i++) {
            if (a[i] < max) {
                max = a[i];
            }
        }
        System.out.println();
        System.out.println("The Smallest no. is : " + max);

        int[] b = {6, 1, 4, 9, 2, 5};
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        System.out.println("Second smallest no. is : " + b[1]);
        System.out.println("Third largest no. is : " + b[b.length - 3]);
    }

}