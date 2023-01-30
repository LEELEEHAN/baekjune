package stage2;

import java.util.Scanner;

public class Main2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h,m,g,p;
        h = sc.nextInt();
        m = sc.nextInt();
        if(m<45){
            if(h==0){
             h=23;
            }else{
            h--;}
            g=45-m;
            m=60-g;
        } else {
            m-=45;
        }
    }
}
