package Algorithm.CYJ;

import java.util.Scanner;

public class 코드마스터_2023_28235 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        switch(s) {
            case "SONGDO": System.out.println("HIGHSCHOOL");
                           break;
            case "CODE": System.out.println("MASTER");
                         break;
            case "2023": System.out.println("0611");
                         break;
            case "ALGORITHM": System.out.println("CONTEST");
                              break;
        }
        sc.close();
    }
}
