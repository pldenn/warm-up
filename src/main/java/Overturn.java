public class Overturn {

    public String reverseString (String rev) {
        char[] array = rev.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >=0 ; i--) {
            result += array[i];
        }
        return result;
    }

}
