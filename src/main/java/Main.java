import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        String inputString;
        String reverseString;
        int warmIterations = 100;
        int[] iterations = {1_000, 10_000, 100_000};
        long[] executionTime;

        inputString = input();
        reverseString = reverseString(inputString);
        executionTime = getExecutionTime(inputString, warmIterations, iterations);

        System.out.println(inputString);
        System.out.println(reverseString);
        for (long l : executionTime) {
            System.out.print(l + " ");
        }
    }

    public static String reverseString(String rev) {
        return new StringBuilder(rev).reverse().toString();
    }



    public static String input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваше слово");
        return sc.nextLine();
    }

    public static long[] getExecutionTime(String inputString, int warmIterations, int[] iterations) {
        long[] ExecutingTime = new long[iterations.length];

        for (int i = 0; i < warmIterations; i++) {
            reverseString(inputString);
        }

        for (int i = 0; i < iterations.length; i++) {

            long timeStart = System.nanoTime();
            for (int j = 0; j < iterations[i]; j++) {
                reverseString(inputString);
            }
            long timeEnd = System.nanoTime();
            ExecutingTime[i] = TimeUnit.MILLISECONDS.convert(timeEnd - timeStart, TimeUnit.NANOSECONDS);
        }
        return ExecutingTime;
    }
}
