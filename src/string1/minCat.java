package string1;

public class minCat {
    public String minCat(String a, String b) {
        int n;
        if (a.length() > b.length()) {
            n = b.length();
            return a.substring(a.length() - n) + b;
        } else if (a.length() < b.length()) {
            n = a.length();
            return a + b.substring(b.length() - n);
        } else { // lengths are equal
            return a + b;
        }
    }
}
