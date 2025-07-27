package string1;

public class plusOut {
    public String plusOut(String str, String word) {
        String result = "";
        int i = 0;

        while (i < str.length()) {
            if (i <= str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) {
                result = result + word;
                i = i + word.length();
            } else {
                result = result + "+";
                i = i + 1;
            }
        }

        return result;
    }
}
