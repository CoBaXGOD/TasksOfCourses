/* эту задачу решал дня 2, по факту я ее сделал за 10 минут, но не добавил цикл, и еще была проблема с знаком "==",
 оказалось, что любой язык программирования плохо работает с этим знаком в главе с String
 это - изначальное решение, полное - в NewTask13
 */

package Task_of_courses;

import java.util.Scanner;

public class NewTask12 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("What is it: blue, big, with a mustache and completely stuffed with hares?");
        String a = "Красава!";
        String b = "Подумай еще";
        String c = "Правильный ответ: троллейбус";
        String tr = "Троллейбус";
        String d = x.nextLine();
        if (d.equals(tr)) { //while
            System.out.println(a);

        } else if (d == "Сдаюсь") {
            System.out.println(c);


        } else if (d != tr) {
            System.out.println(b);

        } else if (d != tr) {
            System.out.println(b);

        } else if (d != tr)
            System.out.println(c);
    }
}