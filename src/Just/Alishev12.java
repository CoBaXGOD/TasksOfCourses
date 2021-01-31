package Just;

public class Alishev12 {
    public static void main(String[] args) {
    int[] num = new int[5];
    num[0] = 10;
    String[] strings = new String[3];
    strings[0] = "привет";
    strings[1] = "пока";
    strings[2] = "джава";

        for (int i = 0; i < strings.length; i++) {
        System.out.println(strings[i]);
    }
        for (String x : strings) {
        System.out.println(x);
    }
    int[] num1 = {1, 2, 3};
    int sum = 0;
        for (int a : num1) {
        sum = sum - a;
    }
        System.out.println(sum);
    int value = 0;
    String s;
}
}
