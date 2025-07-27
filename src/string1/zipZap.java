package string1;

public class zipZap {
    public String zipZap(String str) {
        String result = "";

        int i = 0;
        while (i < str.length()) {
            if (i <= str.length() - 3 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result = result + "zp";
                i = i + 3;
            } else {
                result = result + str.charAt(i);
                i = i + 1;
            }
        }

        return result;
    }
}
