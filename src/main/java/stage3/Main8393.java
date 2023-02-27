package stage3;

import java.util.Scanner;

public class Main8393 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int k=0;
        for(int i = 1; i<=a;i++){
            k+=i;
        }
        System.out.println(k);
    }
}
