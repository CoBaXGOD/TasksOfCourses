package SoloLearn;

public class Lesson22_2 {
    public static void main(String[] args) {
        double [] myArray = {33,44,22,11};
        double sum = 0.0;
        for (int x=0; x<myArray.length;x++){
            sum+=myArray[x];
        }
        System.out.println(sum);
    }
}
