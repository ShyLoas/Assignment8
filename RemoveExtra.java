package assignment8;

import java.util.Scanner;

public class RemoveExtra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String n = sc.nextLine();
        
        n = n.trim().replaceAll("\\s+", "");
        System.out.println("After Remove: " + n);
    }
}