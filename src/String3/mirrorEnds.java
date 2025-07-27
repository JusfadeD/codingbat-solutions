public class mirrorEnds {
    public String mirrorEnds(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char startChar = str.charAt(i);
            char endChar = str.charAt(str.length() - 1 - i);

            if (startChar == endChar) {
                result = result + startChar;
            } else {
                break;
            }
        }

        return result;
    }
}
