package Task17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int sum = 0;

        for (int i = 3; i <= n; i += 3) {
            sum += i;
            System.out.println(sum);
        }
    }
}
