package recursion1;

public class strCount {
    public int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }

        if (str.substring(0, sub.length()).equals(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        } else {
            return strCount(str.substring(1), sub);
        }
    }
}
