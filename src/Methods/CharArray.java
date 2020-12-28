package Methods;

public class CharArray {
    char[] array = new char[10];

    void One(char[] array) {
        int beginIndex = 0;
        int endIndex = array.length - 1;
        while (beginIndex < endIndex && array[beginIndex] == ' ') {
            beginIndex++;
        }
        while (beginIndex < endIndex && array[endIndex] == ' ') {
            endIndex--;
        }
        char[] result = new char[(endIndex - beginIndex) + 1];
        int index = 0;
        for (int i = beginIndex; i < endIndex + 1; i++) {
            result[index++] = array[i];

        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

        }

    }

    void Two(char[] array) {
        char c = 'o';
        int count = 0;
        for (int x : array
        ) {
            if (x == c) {
                count += 1;
            }
        }
        System.out.println("c tareri qanake " + count);
    }

    void Three(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array.length % 2 == 0) {

            }
        }
        System.out.println(array[array.length / 2 + 1]);
        System.out.println(array[array.length / 2]);

    }

    void Four(char[] array) {
        if (array[array.length - 2] == 'l' && array[array.length - 1] == 'y') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    void Five(char[] array) {
        boolean a = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'b' && array[i + 2] == 'b') {
                a = true;
            }
        }
        System.out.println(a);
    }
}
