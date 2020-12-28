package braceChecker;

import braceChecker.model.BraceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        BraceChecker braceChecker = new BraceChecker("Hello (from) {Gyumri]");
        braceChecker.check();

    }
}
