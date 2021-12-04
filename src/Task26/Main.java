package Task26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        double sum = 1.0;

        for (int i = 1, j = 2; i <= n; i++, j++) {
            sum += i / j;
        }
    }
}
