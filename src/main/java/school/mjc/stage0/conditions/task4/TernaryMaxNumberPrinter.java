package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int a = (first>second?first:second)<third?third:(first>second?first:second);
        System.out.println(a);
    }
}
