package stage2;

import java.util.Scanner;

public class Main2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h,m,a,g;
        h=sc.nextInt();
        m=sc.nextInt();
        a=sc.nextInt();

        if(a+m>=60){
            if(h=23){
                h=0;
            } else{



                h++;
            }
          g = a+m-60;
          m-=g;
          System.out.println();
        } else {
            m+a;
        }
    }
}
