package Methods;

public class FigurePainter {
    void FigureOne(int z) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void FigureSecond(int k) {
        for (int i = 1; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    void FigureThired(int n) {
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

    void FigureFour(int m) {
        int i, j, z;
        for (i = 5; i > 0; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (z = 5; z > i; z--) {
                System.out.print(" *");
            }
            System.out.println("");
        }
        for (i = 5; i >= 1; i--) {
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (z = 1; z < i; z++) {
                System.out.print(" *");
            }
            System.out.println("");
        }

    }

    void FigureEnd(int o) {
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


