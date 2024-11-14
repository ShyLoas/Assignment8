package assignment8;

import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String n = sc.nextLine();
        StringBuffer sb = new StringBuffer(n);
        sb.reverse();
        String d = sb.toString();
        if (n.equals(d)) {
            System.out.println(n + " is a Palindrome");
        } else {
            System.out.println(n + " is not a Palindrome");
        }
    }
}
