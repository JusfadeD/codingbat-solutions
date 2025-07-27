package string1;

public class repeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        String result = "";

        if (count == 0) {
            return "";
        }

        for (int i = 0; i < count; i++) {
            result = result + word;

            if (i != count - 1) {
                result = result + sep;
            }
        }

        return result;
    }
}
