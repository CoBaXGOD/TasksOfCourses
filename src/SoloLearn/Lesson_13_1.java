package SoloLearn;

public class Lesson_13_1 {
    public static void main(String[] args) {
        int age = 15;
        if (age <= 0) {
            System.out.println("Error");
        } else if (age <= 16) {
            System.out.println("Too Young");
        } else if (age < 100) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Really?");
        }
    }
}
