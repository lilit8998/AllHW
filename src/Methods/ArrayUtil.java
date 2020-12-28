package Methods;

public class ArrayUtil {
    int[] array = new int[10];

    void ExersiceOne(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    void ExersiceTwo(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The largest number is:" + max);
    }

    void ExersiceThree(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The smallest number is:" + min);
    }

    void ExersiceFour(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);

            }

        }
    }

    void ExersiceFive(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {

                count += 1;
            }

        }
        System.out.println(count);
    }

    void ExersiceSix(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count += 1;

            }

        }
        System.out.println(count);

    }

    void ExersiceSeven(int[] array) {
        int count = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            count += 1;
            System.out.println(sum);
            System.out.println(count);
        }
        System.out.println(sum / count);
    }

    void ExerciseEight(int[] array) {
        int j = 0;

        for (int i = 0; i < array.length; i += 1) {
            j += array[i];

        }
        System.out.println(j);
    }

}
