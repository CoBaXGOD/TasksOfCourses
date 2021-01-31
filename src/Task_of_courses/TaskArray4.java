package Task_of_courses;

public class TaskArray4 {
    public static void main(String[] args) {
        int[] sasha = new int[50];
        for (int i = 49; i >= 0; i--) {
            sasha[i] = i * 2 + 1;
            System.out.print(sasha[i] + " ");
        }
    }
}
