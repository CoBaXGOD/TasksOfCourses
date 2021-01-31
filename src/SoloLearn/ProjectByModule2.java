package SoloLearn;

import java.util.Scanner;

public class ProjectByModule2 {


    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = 0;
        int b = x.nextInt();
        for (int i = 0; i <= 5; i++) {
            a = b - b * 10 / 100;
            b=a;
            System.out.println(a);
        }
    }
}
