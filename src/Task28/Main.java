package Task28;

import java.util.Scanner;
import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int w = in.nextInt();
        int k = 1;
        int n = in.nextInt();

        int neededSum = 0;

        for (int i = 1; i <= w; i++) {
            k++;
        }

        neededSum = n - k;

        int result = neededSum >= 0 ? 0 : abs(neededSum);

        System.out.println(result);
    }
}
