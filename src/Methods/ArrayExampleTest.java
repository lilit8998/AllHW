package Methods;

public class ArrayExampleTest {
    public static void main(String[] args) {

        ArrayExample ae = new ArrayExample();
        int[] array = {1, 11, 5, 4, 6, 54, 80, 12, 102, 11};
        ae.ExeFirst(array, 4);
        int[] arrayIndex = {1, 11, 10, 2, 6, 54, 80, 12, 102, 11};
        ae.ExeTwo(arrayIndex, 6);
        int[] arrayIndexValue = {1, 11, 10, 2, 6, 54, 80, 12, 102, 11};
        ae.ExeThree(arrayIndexValue, 3);
        int[] arrayDoubleNum = {1, 11, 10, 2, 6, 54, 80, 12, 102, 11};
        ae.ExeFour(arrayDoubleNum);
        int[] arraySortMaxMin = {1, 11, 10, 2, 6, 54, 80, 12, 102, 11};
        ae.ExeFive(arraySortMaxMin);
        int[] arraySortMinMax = {1, 11, 10, 2, 6, 54, 80, 12, 102, 11};
        ae.ExeSix(arraySortMinMax);
    }
}
