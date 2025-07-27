package string1;

public class xyzThere {
    public boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z') {
                if (i == 0 || str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }

        return false;
    }
}
