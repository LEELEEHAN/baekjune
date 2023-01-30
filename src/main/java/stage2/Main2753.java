package stage2;

import java.util.Scanner;

public class Main2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yyyy =sc.nextInt();
        if((yyyy%4) == 0)
            if((yyyy%100)!=0||(yyyy%400)==0) {
                System.out.println("1");
            }
        } else {
            System.out.println("0");
        }
    }
}
