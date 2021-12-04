package Task24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double n = 1.0;
        double sum = 0.0;

        while (n != 0) {
            n = in.nextDouble();
            sum *= n;
        }

        System.out.println(sum);
    }
}
