import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Main over = new Main();
    static boolean onOff = true;

    public static void main(String[] args) {
        String inputString;
        String reverseString;
        int warmIterations = 100;
        int[] iterations = {1_000,10_000,100_000};

        inputString = input();
        reverseString = reverseString(inputString);


        System.out.println( inputString + reverseString);




        over.reverseString(over.input());
    }

    public static String reverseString(String rev) {
        String result = new StringBuilder(rev).reverse().toString();

        if (onOff) {
            System.out.println(result);
            onOff = false;
            over.checkTime(rev);
        }

    return result;
    }

    public static String input() {
        String inputLine = null;
        System.out.println("Введите Ваше слово");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
            else System.out.println(inputLine);
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }

    public static void checkTime(String rev) {
        int warming = 1000;
        int count = 1_000;
        int count1 = 10_000;
        int count2 = 100_000;

        for (int i = 0; i < warming; i++)
            over.reverseString(rev);

        long begin = System.nanoTime();
        for (int i = 0; i < count; i++)
            over.reverseString(rev);
        long end = System.nanoTime();
        System.out.println("Время работы метода на 1000 повторениях " + (end - begin) / count + " нс");

        long begin1 = System.nanoTime();
        for (int i = 0; i < count1; i++)
            over.reverseString(rev);
        long end1 = System.nanoTime();
        System.out.println("Время работы метода на 10000 повторениях " + (end1 - begin1) / count1 + " нс");

        long begin2 = System.nanoTime();
        for (int i = 0; i < count2; i++)
            over.reverseString(rev);
        long end2 = System.nanoTime();
        System.out.println("Время работы метода на 100000 повторениях " + (end2 - begin2) / count2 + " нс");
    }
}
