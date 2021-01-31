package Just;

public class Array_sasha {
    public static void main(String[] args) {
        int[] name = new int[] {22, 33, 33};
        for (int i = 0; i < name.length; i++) {
            name[i] = i * 10;
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}

