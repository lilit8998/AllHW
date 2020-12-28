package Artur;

public class Vasili {
    public static void main(String[] args) {
        int num=100;
        System.out.println(num);
        num=num*2;
        System.out.println(num);

        if (num<100){
            System.out.println("num<100");


        }

    }

}
class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if (x < y) ;
        System.out.println("x<y");

        x = x * 2;
        if (x == y) ;
        System.out.println("x==y");

        x = x * 2;
        System.out.println(x);
        if (x > y) ;
        System.out.println("x>y");
    }

    }

    class ForTest {
        public static void main(String[] args) {
            int x;
            for (x = 0; x < 10; x+=2) {
                System.out.println("x" +x);


            }

        }
    }

    class BlockTest {
        public static void main(String[] args) {
            int x,y;
            y=20;
            for ( x = 0; x < 10; x++) {
                System.out.println(x);
                System.out.println(y);
                y=y-2;

            }
        }

    }









