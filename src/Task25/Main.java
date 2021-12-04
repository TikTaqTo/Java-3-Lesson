package Task25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 1;
        int sum = 0;

        while (n != 0) {
            n = in.nextInt();
            if (n % 2 != 0) {
                sum += n;
            }
        }

        System.out.println(sum);
    }
}
