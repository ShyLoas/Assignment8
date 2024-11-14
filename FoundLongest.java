package assignment8;

import java.util.Scanner;

public class FoundLongest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String n = sc.nextLine();
        
        String[] w = n.split(" ");
        String l = " ";
        for(int i = 0; i < w.length; i++){
            if(w[i].length() >= l.length()){
                l = w[i];
            }
        }
        System.out.println(l);
    }
}