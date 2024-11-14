package assignment8;

import java.util.Scanner;

public class Split {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String n = sc.nextLine();
        
        String[] arr = n.split(" ");
        for(String a : arr){
            System.out.println(a);
        }
    }
}