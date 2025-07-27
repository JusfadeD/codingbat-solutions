package string1;

public class prefixAgain {
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);

        for (int i = 1; i <= str.length() - n; i++) {
            String sub = str.substring(i, i + n);

            if (sub.equals(prefix)) {
                return true;
            }
        }

        return false;
    }
}
