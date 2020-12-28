package Example.ChapterSeven;

public class OverloadDemo {

    void test() {
        System.out.println("parametri otcustvuyut");
    }

    void test(int a) {
        System.out.println("a:" + a);
    }

    void test(int a, int b) {
        System.out.println("a and b:" + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a:" + a);
        return a * a;
    }
}

class Factorial {
    int fact(int n) {
        int result;

        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}

class RecTest {
    int values[];

    RecTest(int i) {
        values = new int[i];
    }

    void printArray(int i) {
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "]");
    }
}
