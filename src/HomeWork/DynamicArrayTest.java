package HomeWork;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

        da.add(6);
        da.add(16);
        da.add(25);
        da.add(30);
        da.add(10);
        da.add(28);
        da.add(11);
        da.add(41);
        da.add(71);

//            da.deleteByIndex(1);
//            da.print();
        int[] result = da.subArray(2, 5);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");

        }

    }
}
