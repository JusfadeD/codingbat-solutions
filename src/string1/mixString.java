package string1;

public class mixString {
    public String mixString(String a, String b) {
        String result = "";
        int minLength;

        if (a.length() < b.length()) {
            minLength = a.length();
        } else {
            minLength = b.length();
        }

        for (int i = 0; i < minLength; i++) {
            result = result + a.charAt(i);
            result = result + b.charAt(i);
        }

        if (a.length() > minLength) {
            result = result + a.substring(minLength);
        }

        if (b.length() > minLength) {
            result = result + b.substring(minLength);
        }

        return result;
    }
}
