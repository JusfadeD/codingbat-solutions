package string1;

public class withoutX2 {
    public String withoutX2(String str) {
        if (str.length() == 0) {
            return str;
        }

        StringBuilder result = new StringBuilder();

        if (str.length() >= 1 && str.charAt(0) != 'x') {
            result.append(str.charAt(0));
        }

        if (str.length() >= 2 && str.charAt(1) != 'x') {
            result.append(str.charAt(1));
        }

        if (str.length() > 2) {
            result.append(str.substring(2));
        }

        return result.toString();
    }
}
