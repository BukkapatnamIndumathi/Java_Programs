package Patterns;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter M: ");
        int M = sc.nextInt();

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int count = 0;

        for (int i = M; i <= N; i++) {

            int num = i;
            int rev = 0;

            while (num != 0) {
                int digit = num % 10;
                rev = rev * 10 + digit;
                num = num / 10;
            }

            if (rev == i) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
