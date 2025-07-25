package string1;

public class twoChar {
    public String twoChar(String str, int index) {
        if (str.length() <= 2) {
            return str.substring(0, 2);
        }
        if (index < 0 || index + 2 > str.length()) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }
}
