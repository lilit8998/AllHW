package HomeWork;

public class DynamicArray {

    //himnakan masiv vortex pahelu enq avelacvoc elemennern en
    int[] array = new int[10];

    //sa mer massivi mej avelacvac elementneeri qanakn e
    private int size = 0;

    //ays metodov stugum enq ete massivi mej tex chka kanchel extend()
    //ev avelacnenq
    public void add(int value) {
        if (size == array.length) {
            extend();

        }
        array[size++] = value;
    }

    //1.stexcel hin masivic 10 element aveli mec massiv
    //2.gcel hin massivi elementnere nori mej
    //3. hin massivi hxume kapenq nor massivi hxman het
    private void extend() {
        int[] arr = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];

        }
        array = arr;
    }

    //tpel masivi avelacvac metodnere
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }

    //ete trvac indexe mer unecac massivi unecac indexi sahmannerum e veradardznel
    // masivi index-erord elemente.Hakarak depqum veradardznel -1
    public int getByIndex(int index) {
        return index >= 0 && index < size ? array[index] : -1;
    }

    public int max() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max) {
                array[i] = max;
            }

        }
        return max;
    }

    public int min() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                array[i] = min;
            }

        }
        return min;
    }

    public void deleteByIndex(int index) {
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;

    }


    public void deleteByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                deleteByIndex(i);
                break;
            }
        }
    }


    public int[] subArray(int startIndex, int endIndex) {
        int[] tmp = new int[(endIndex - startIndex) + 1];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            tmp[index++] = array[i];
        }
        return tmp;
    }

    public int[] subArray(int startIndex) {

        return subArray(startIndex, size - 1);
    }

}
