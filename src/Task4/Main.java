package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int i = n;

        while (i != m) {
            System.out.print(i + " ");
            i++;
        }
    }
}
