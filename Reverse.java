package assignment8;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String n = sc.nextLine();
        
        StringBuffer sb = new StringBuffer(n);
        System.out.println("After Reverse: " + sb.reverse());
    }
}