package HomeWork;

public class ForHomeWork {
    public static void main(String[] args) {
        //mer orinake
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


//         * * * *
//         * * *
//         * *
//         *

        for (int i = 1; i <5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }


//           *
//        *  *
//     *  *  *
//  *  *  *  *
        int i, j, z;
        for (i = 5; i > 0; i--) {
            for (j = 1; j < i; j++) {
                System.out.print("   ");
            }
            for (z = 5; z > i; z--) {
                System.out.print("  *");
            }
            System.out.println("   ");
        }
    }
}



