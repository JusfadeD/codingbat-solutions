public class sameEnds {
    public String sameEnds(String str) {
        String result = "";
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            String start = str.substring(0, i + 1);
            String end = str.substring(len - i - 1);

            if (start.equals(end)) {
                result = start;
            }
        }

        return result;
    }
}
