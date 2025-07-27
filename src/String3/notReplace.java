public class notReplace {
    public String notReplace(String str) {
        String result = "";
        int i = 0;

        while (i < str.length()) {
            if (i <= str.length() - 2 && str.substring(i, i + 2).equals("is")) {
                boolean before = (i > 0) && Character.isLetter(str.charAt(i - 1));
                boolean after = (i + 2 < str.length()) && Character.isLetter(str.charAt(i + 2));

                if (!before && !after) {
                    result = result + "is not";
                    i = i + 2;
                    continue;
                }
            }

            result = result + str.charAt(i);
            i = i + 1;
        }

        return result;
    }
}
