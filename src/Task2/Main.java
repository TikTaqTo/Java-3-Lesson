package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String S = in.next();
        int n = in.nextInt();

        while(n != 0){
            System.out.println(S);
            n--;
        }
    }
}