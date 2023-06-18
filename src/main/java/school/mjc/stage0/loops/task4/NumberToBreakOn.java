package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (toBreakWith>numberToGoUntil){
            System.out.println("iterating till the end");
            for( int k = 0; k<=numberToGoUntil; k++){
                System.out.println(k);
            }
        }
        else {
            for( int k = 1; k<=toBreakWith; k++){
                System.out.println(k);
            }
        }

    }
}
