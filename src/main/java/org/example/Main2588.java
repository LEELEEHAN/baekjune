package org.example;

import java.util.Scanner;

public class Main2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.nextLine();
        sc.close();
        System.out.println(a*b.charAt(2));
        System.out.println(a*b.charAt(1));
        System.out.println(a*b.charAt(0));
        System.out.println(a*Integer.parseInt(b));
    }
}
