package Example.ChapterSeven;

public class OverloadDemoTest {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);

        System.out.println("result call ob.test(123.25):" + result);
    }
}

class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("faktorial 3: " + f.fact(3));

    }
}

class CommandLine{
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args ["+i+"]"+args[i]);

        }
    }
}

class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int i;

        for (i = 0; i < 10; i++) ob.values[i] = i;
        ob.printArray(10);

    }
}
