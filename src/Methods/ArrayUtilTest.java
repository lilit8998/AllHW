package Methods;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil au = new ArrayUtil();
        int[] array = {1, 11, 5, 4, 6, 54, 80, 12, 102, 11};
        au.ExersiceOne(array);
        int[] arratMax = {1, 25, 10, 14, 13, 6, 3, 65, 90, 11};
        au.ExersiceTwo(arratMax);
        int[] arrayMin = {1, 25, 23, 102, 111, 56, 12, 12, 3, 5};
        au.ExersiceThree(arrayMin);
        int[] arrayOdd = {1, 21, 23, 102, 10, 51, 12, 2, 3, 5};
        au.ExersiceFour(arrayOdd);
        int[] arrayEven = {1, 22, 23, 102, 10, 51, 12, 2, 3, 5};
        au.ExersiceFive(arrayEven);
        int[] arrayOddCount = {1, 11, 23, 102, 10, 51, 12, 2, 3, 5};
        au.ExersiceSix(arrayOddCount);
        int[] arrayAvg = {1, 11, 23, 202, 10, 51, 12, 2, 3, 5};
        au.ExersiceSeven(arrayAvg);
        int[] arrayElementSum = {1, 11, 23, 202, 10, 51, 12, 2, 3, 5};
        au.ExerciseEight(arrayElementSum);


    }
}
