import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Overturn {

    public static void main(String[] args) {
        Overturn over = new Overturn();
        System.out.println(over.reverseString(over.input()));
    }

    public String reverseString (String rev) {
        char[] array = rev.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = array.length - 1; i >=0 ; i--) {
            result.append(array[i]);
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
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
}
