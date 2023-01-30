package stage2;

import java.util.Scanner;

public class Main14687 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>0){
            if(b>0){
                System.out.println("3");
            } else if (b<0) {
                System.out.println("2");
            }
        } else if (a<0){
            if(b>0){
                System.out.println("4");
            } else if (b<0) {
                System.out.println("1");
            }
        }

    }
}
