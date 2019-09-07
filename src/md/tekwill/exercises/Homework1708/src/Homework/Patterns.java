package Homework;

public class Patterns {
    public static void main(String[] args) {
        Patterns a = new Patterns();
        Patterns b = new Patterns();
        Patterns c = new Patterns();
        Patterns d = new Patterns();
        a.patternA();
        b.patternB();
        c.patternC();
        d.patternD();
    }

    public void patternA() {
        System.out.println("Pattern A");
        for (int i = 1; i <= 6; ++i) {
            for (int j = 1; j <= 6; ++j) {
                if (j <= i)
                    System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    public void patternB() {
        System.out.println("Pattern B");
        for (int i = 6; i >= 1; --i) {
            for (int j = 1; j <= 6; ++j) {
                if (j <= i)
                    System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    public void patternC() {
        System.out.println("Pattern C");
        for (int i = 1; i <= 6; ++i) {
            for (int j = 6; j >= 1; --j) {
                if (j > i)
                    System.out.print("  ");
                else if (j <= i)
                    System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    public void patternD() {
        System.out.println("Pattern D");
        for (int i = 6; i >= 1; --i) {
            for (int j = 1; j <= 6; ++j) {
                if (i < 6) {
                    System.out.print("  ");
                    if (j <= i) {
                        System.out.print(j + " ");
                    }

                }
            }
                System.out.println(" ");
        }
    }
}