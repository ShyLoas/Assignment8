package assignment8;

import java.util.Scanner;

public class Convert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String n = sc.nextLine();
        StringBuffer sb = new StringBuffer(n);
        for(int i = 0; i < n.length(); i++){
            if(Character.isLowerCase(n.charAt(i))){
                sb.setCharAt(i, Character.toUpperCase(n.charAt(i)));
            }else if(Character.isUpperCase(n.charAt(i))){
                sb.setCharAt(i, Character.toLowerCase(n.charAt(i)));
            }
        }
        System.out.println("After Convert: " + sb);
    }
}
