package string1;

public class xyBalance {
    public boolean xyBalance(String str) {
        boolean hasY = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'y') {
                hasY = true;
            }

            if (str.charAt(i) == 'x' && !hasY) {
                return false;
            }
        }

        return true;
    }
}
