package Algorithm.CYJ;

import java.util.Scanner;

public class 알고리즘_수업_점근적_표기_1_24313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();
        System.out.println((a1 * n0 + a0 <= c * n0) && (c >= a1) ? 1 : 0);
        sc.close();
    }
}
