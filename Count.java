package assignment8;

import java.util.Scanner;

public class Count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String n = sc.nextLine();
        Counted(n);
    }
    public static void Counted(String n){
        int c[] = new int[256];
        for(int i = 0; i < n.length(); i++){
            c[n.charAt(i)]++;
        }
        char a[] = new char [n.length()];
        for(int i = 0; i < n.length(); i++){
            a[i] = n.charAt(i);
            int f = 0;
            for(int j = 0; j <= i; j++){
                if(n.charAt(i) == a[i]){
                    f++;
                }
                if(f== i){
                    System.out.println("Occurences of " + n.charAt(i) + " is: " + c[n.charAt(i)]);
                }
            }
        }
    }
}
