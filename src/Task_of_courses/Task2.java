package Task_of_courses;

public class Task2 {
    public static void main(String[] args) {
        double temperature = 26;


        if (temperature < 10) {
            System.out.println("Put on jacket");
        } else if (temperature >= 10 && temperature < 18) {
            System.out.println("Put on pants");
        } else if (temperature >= 18 && temperature <= 25) {
            System.out.println("Put on gloves");
        } else if (temperature > 25) {
            System.out.println("Put on nothing");
        }
    }
}


