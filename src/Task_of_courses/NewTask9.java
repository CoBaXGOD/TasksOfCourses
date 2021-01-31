package Task_of_courses;

import java.util.Scanner;

public class NewTask9 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int b = x.nextInt();
        int sum = 0;
        for (int a = 1; a <= b; a++)
            sum = sum + a;


        System.out.println(sum);
    }
}
