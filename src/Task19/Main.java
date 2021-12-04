package Task19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 1;
        int col = 0;

        while (n != 0) {
            n = in.nextInt();
            col++;
        }

        System.out.println(col);
    }
}
