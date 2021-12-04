package Task22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 1;
        int maxNum = 0;

        while (n != 0) {
            n = in.nextInt();
            maxNum = maxNum > n ? maxNum : n;
        }

        System.out.println(maxNum);
    }
}
