package recursion1;

public class endX {
    public String endX(String str) {
        if (str.length() == 0) {
            return "";
        }

        char first = str.charAt(0);
        if (first == 'x') {
            return endX(str.substring(1)) + 'x';
        } else {
            return first + endX(str.substring(1));
        }
    }
}
