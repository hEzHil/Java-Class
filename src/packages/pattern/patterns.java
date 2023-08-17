package packages.pattern;

public class patterns {
    public static void main(String[] args) {
        Rgt2Lft rPatt = new Rgt2Lft();
        rPatt.rgt2Lft();
    }
}

    class Lft2Rgt {
        static void lft2rgt() {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }

            for (int i = 0; i < 5; i++) {
                for (int j = 5; j > i; j--) {
                    System.out.print("*");
                }
                System.out.println(" ");

            }
        }
    }

    class RevRgt2Lft {
        static void revRgt2Lft() {
            for (int i = 0; i < 5; i++) {
                for (int j = 5; j > i; j--) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }

        }
    }

    class Rgt2Lft {

        static void rgt2Lft() {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j <= 5; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
    }



