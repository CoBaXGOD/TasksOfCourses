package Task_of_courses;

import java.util.Scanner;

public class TaskArray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] array = text.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
            System.out.println(result);
        }
    }
}
