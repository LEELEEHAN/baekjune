package stage2;

import java.util.Scanner;

public class Main2525{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h,m,a;
        h=sc.nextInt();
        m=sc.nextInt();
        a=sc.nextInt();
W
        h+=a/60;
        m+=a%60;

        if(m>60){
            h+=1;
            m-=60;
        }
        if(h>=24){
            h-=24;
        }
        System.out.println(h+""+m);

    }
}
