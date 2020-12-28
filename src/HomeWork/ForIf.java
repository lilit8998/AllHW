package HomeWork;

public class ForIf {
    public static void main(String[] args) {
        int[] array = {11, 25, 8, 45, 60, 120, 1, 32, 91, 41};
        //1.Տպեք մասիվի բոլոր էլեմենտները

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //2.Տպեք մասիվի ամենամեծ թիվը
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("The largest number is:" + max);

        //3.Տպեք մասիվի ամենափոքրը թիվը,
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

  //      System.out.println("The smallest number is:" + min);
        //4.Տպեք մասիվի բոլոր զույգ էլեմենտները

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                System.out.println(array[i]);
//
//            }


 //       5.Տպեք մասիվի բոլոր կենտ էլեմենտները
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    System.out.println(array[i]);

                }

            }

        //6.Տպեք զույգերի քանակը
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {

                    count += 1;
                    System.out.println(count);
                }

            }

        //7.Տպեք կենտերի քանակը
//            int count = 0;
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] % 2 != 0) {
//                    count += 1;
//                    System.out.println(count);
//
//                }
//
//            }


        //8/. Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
//            int count = 0;
//            int sum = 0;
//
//            for (int i = 0; i < array.length; i++) {
//                sum += array[i];
//                count += 1;
//                System.out.println(sum);
//                System.out.println(count);
//            }
//            System.out.println(sum / count);

        //9. Տպեք մասիվի էլեմենտների գումարը։
            int j = 0;

            for (int i = 0; i < array.length; i += 1) {
                j += array[i];
                System.out.println(j);
            }
    }
}
