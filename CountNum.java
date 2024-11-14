package assignment8;

import java.util.Scanner;

public class CountNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String n = sc.nextLine();
        
        n = n.trim();
        if(n.isEmpty()){
            System.out.println("Can't found words");
        }else{
            String[] w = n.split(" ");
            System.out.println("Words: " + w.length);
        }
    }
}