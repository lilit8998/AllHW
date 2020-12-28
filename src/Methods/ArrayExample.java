package Methods;

public class ArrayExample {
    int[] array = new int[10];

    void ExeFirst(int[] array, int x) {
        boolean isExists = false;
        for (int i = 0; i < array.length; i += 1) {
            if (array[i] == x) {
                isExists = true;
            }
        }
        System.out.println(isExists);
    }

    void ExeTwo(int[] array, int x) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index = i;
            }
        }
        System.out.println(index);
    }

    void ExeThree(int[] array, int index) {

        if (index >= 0 && index < array.length) {
            System.out.println(array[index]);
        } else {
            System.out.println("Please inpput another index ");
        }
    }

    void ExeFour(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[j] + "թիվը կրկնվում է");
                }
            }
        }
    }

    void ExeFive(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int maxId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    maxId = j;
                }
            }
            int temp = array[i];
            array[i] = max;
            array[maxId] = temp;
            System.out.print(array[i] + " ");

        }
    }

    void ExeSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        System.out.print(array.length - 2);
    }
}
