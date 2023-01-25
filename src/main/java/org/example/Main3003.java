package org.example;

import java.util.Scanner;

public class Main3003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int date[] = {1,1,2,2,2,8};
        int real[] = new int[6];
    for(int i = 0; i< date.length;i++){
        real[i] =sc.nextInt();
        System.out.print(date[i]-real[i]+" ");
        }
    }
}
