import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Overturn {
       static Overturn over = new Overturn();

    static boolean onOff = true;
    public static void main(String[] args) {
        over.reverseString(over.input());


    }

    public String reverseString (String rev) {

        char[] array = rev.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = array.length - 1; i >=0 ; i--) {
            result.append(array[i]);

        }
        if (onOff){
            System.out.println(result.toString());
            onOff = false;
            int count = 1_000;
            int count1 = 10_000;
            int count2 = 100_000;

            long begin =  System.nanoTime();
            for (int i = 0; i < count; i ++)
                over.reverseString(rev);
            long end = System.nanoTime();
            System.out.println("Время работы метода на 1000 повторениях " + (end - begin) / count + " мс");
        }
        return result.toString();
    }

    public String input() {
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
    public void CheckTime(){

    }
}
