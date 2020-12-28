package Example;

public class exa {
    public static void main(String[] args) {
        int array[] = {10, 20, 30, 50, 5, 4, 6, 7, 8};
        array[0] = 15;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
