package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
 int n = 0;
        for (int t = 1; t <= lastPrinted; t++) {
            n++;
            if (n % 3 == 0) {
                continue;
            } else {
                System.out.println(t);
            }
        }

    }
}
