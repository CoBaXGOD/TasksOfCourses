package Task_of_courses;

import java.util.Scanner;

public class NewTask13 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("What is it: blue, big, with a mustache and completely stuffed with hares?");
        String a = "Krasava!";
        String b = "think about it";
        String c = "Correct answer: trolleybus";
        String tr = "trolleybus";
        for (int i = 1; i <= 3; i++) {
            String d = x.nextLine();
            if (d.equals(tr)) { //while
                System.out.println(a);
                break;

            } else if (d.equals("I give up")) {
                System.out.println(c);
                break;

            } else if (d != tr && i <= 2) {
                System.out.println(b);

            } else if (d != tr && i == 3) {
                System.out.println(c);
            }
        }
    }
}