package Task_of_courses;

public class Task_6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i%3==0&&i%7==0) {
                System.out.println(i);
            }
           // System.out.println("Это нечетное число"+i);
        }
    }
}