package Task18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int sum = 0;
        int col = 0;

        for (int i = n; i <= m; i++) {
            col++;
            sum += i;
        }

        double result = sum / col;

        System.out.println(result);
    }
}
