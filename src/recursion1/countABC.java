package recursion1;

public class countABC {
    public int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        }

        String prefix = str.substring(0, 3);
        if (prefix.equals("abc") || prefix.equals("aba")) {
            return 1 + countAbc(str.substring(1));
        } else {
            return countAbc(str.substring(1));
        }
    }

}
