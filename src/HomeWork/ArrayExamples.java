package HomeWork;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] array = {11, 25, 8, 11, 60, 4, 1, 32, 91, 41};

        //1.Ունենք թիվ, օրինակ՝ int x = 44; ներքևում պետք է գրենք
        // կոդ, որը մեզ կտպի true եթե նշված թիվը կա վերևի մասիվի մեջ, եթե չկա false
//        int x = 4;
//        boolean isExists = false;
//        for (int i = 0; i < array.length; i += 1) {
//            if (array[i] == x) {
//                isExists = true;
//            }
//        }
//        System.out.println(isExists);
        //2.Ունենք թիվ, օրինակ՝ int x = 44; ներքևում պետք է
        // գրենք կոդ, որը մեզ կտպի 44 թվի ինդեքսը մասիվի մեջ եթե կա, եթե չկա -1 կտպի։
////        int x =60;
//        int index = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == x) {
//                index = i;
//            }
//        }
//        System.out.println(index);

        //3.Ունենք թիվ, օրինակ՝ int index = 4; ներքևում պետք է գրենք կոդ, որը
        // կտպի տրված index - ինդեքսի մեջի արժեքը։

//        int index = 4;
//        if (index >= 0 && index < array.length) {
//            System.out.println(array[index]);
//        } else {
//            System.out.println("Please inpput another index ");
//        }


        //4.Գրեք կոդ, որը կգտնի մասիվի մեջի կրկնվող էլեմենտները, ու կտպի որ օրինակ 3-ը կրկնվում է։


//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    System.out.println(array[j] + "թիվը կրկնվում է");
//                }
//            }
//        }

//        //5.Սորտավորենք մեր ունեցած մասիվը մեծից փոքր։
//        for (int i = 0; i < array.length; i++) {
//            int max = array[i];
//            int maxId = i;
//            for (int j = i+1; j < array.length; j++) {
//                if (array[j] > max) {
//                    max = array[j];
//                    maxId = j;
//                }
//            }
//            int temp = array[i];
//            array[i] = max;
//            array[maxId] = temp;
//            System.out.print(array[i]);
//
//               }

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 1; j < array.length - 1; j++) {
//                if (array[j] > array[j - 1]) {
//                    int tmp = array[j];
//                    array[j] = array[j - 1];
//                    array[j - 1] = tmp;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

        //6.Սորտավորենք մեր ունեցած մասիվը փոքրից մեծ։

//        for (int i = 0; i < array.length; i++) {
//            int min = array[i];
//            int minId = i;
//            for (int j = i+1; j < array.length; j++) {
//                if (array[j] < min) {
//                    min = array[j];
//                    minId = j;
//                }
//            }
//
//            int temp = array[i];
//            array[i] = min;
//            array[minId] = temp;
//            System.out.print(array[i]);
//        }
//

        //7.Գրեք կոդ, որը կտպի մասիվի մեջի երկրորդ ամենամեծ թիվը։

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        System.out.println(array.length - 2);


//        int max = array[0];
//        int secMax = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (max < array[i]) {
//                secMax = max;
//                max = array[i];
//            } else {
//                if (array[i] != max && array[i]> secMax){
//                    secMax = array[i];
//                }
//            }
//        }
//        System.out.println(secMax);
    }
}





