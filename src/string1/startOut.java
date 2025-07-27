package string1;

public class startOut {
    public String starOut(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            boolean remove = false;

            if (i > 0 && str.charAt(i - 1) == '*') {
                remove = true;
            }

            if (str.charAt(i) == '*') {
                remove = true;
            }

            if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                remove = true;
            }

            if (!remove) {
                result = result + str.charAt(i);
            }
        }

        return result;
    }
}
