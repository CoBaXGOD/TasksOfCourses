package SoloLearn;

public class Lesson_14 {
    public static void main(String[] args) {
        int age = 25;
        int money = 501;
        if (!(age > 18 && money > 500)) {

            System.out.println("Welcome!");
        }
        if (age > 18 || money > 500) {
            System.out.println("Welcome to Minsk");
        }
    }
}

