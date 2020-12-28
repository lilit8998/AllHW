package Example.PartThree;

//public class Light {
//    public static void main(String[] args) {
//        int lightspeed;
//        long days, seconds, distance;
//        lightspeed = 186000;
//        days = 1000;
//        seconds = days * 24 * 60 * 60;
//        distance = lightspeed * seconds;
//        System.out.print("For" + days);
//        System.out.print("Dney svet prodet okolo");
//        System.out.print(distance + "mil");
//    }
//
//class Area {
//    public static void main(String[] args) {
//        double pi, r, a;
//        r = 10.8;
//        pi = 3.1416;
//        a = pi * r * r;
//        System.out.println("Ploshad kriga ravna " + a);
//    }
//}

//class BoolTest {
//    public static void main(String[] args) {
//        boolean b;
//        b = false;
//        System.out.println("b ravno" + b);
//        b = true;
//        System.out.println("b ravno" + b);
//        if (b) {
//            System.out.println("Eto kod vipalnyaetsya");
//        }
//        b = false;
//        if (b) {
//            System.out.println("etot kod ne rabotet");
//
//        }
//        System.out.println("10 > 9 ravno" + (10 > 9));
//    }
//
//}

//class  DynInit{
//    
//}

//              *
//             * *
//            * * *
//           * * * *
//           * * * *
//            * * *
//             * *
//              *
class PaintFigure {
    public static void main(String[] args) {
//        int i, j, z;
//        for (i = 5; i > 0; i--) {
//            for (j = 1; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (z = 5; z > i; z--) {
//                System.out.print(" *");
//            }
//            System.out.println("");
//        }
//        for (i = 5; i >= 1; i--) {
//            for (j = 5; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (z = 1; z < i ; z++) {
//                System.out.print(" *");
//            }
//            System.out.println("");
//        }
        System.out.println();
        for (int k = 1; k <= 5; k++) {
            for (int l = 0; l <= k; l++) {
                System.out.print("   ");
            }
            for (int l = k; l < 5; l++) {
                System.out.print("  *");

            }
            System.out.println("");
        }

    }

}



