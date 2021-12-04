package Task21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 1;
        double sum = 0;
        double count = 0;

        while (n != 0) {
            n = in.nextInt();
            sum += n;
            count++;
        }

        double result = sum / count;
        System.out.println(result);
    }
}
