public class Overturn {

    public String reverseString (String rev) {
        char[] array = rev.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = array.length - 1; i >=0 ; i--) {
            result.append(array[i]);
        }
        return result.toString();
    }

}
