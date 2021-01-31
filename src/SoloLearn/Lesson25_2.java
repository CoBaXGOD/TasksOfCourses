package SoloLearn;

public class Lesson25_2 {
    public static void main(String[] args) {
        int r = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                r += 10;
            } else {
                r += i;
            }
        }
    }
}
