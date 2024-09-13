package Ansul;

public class StringOperations {
    public static void main(String[] args) {

        String str = "Ansul chahal";
        String[] a = str.split(" ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");

        }
        System.out.println();
        System.out.println("Even numbers between 0 and 100 are: ");
        for (int j = 0; j <= 100; j++) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }

    }
}
