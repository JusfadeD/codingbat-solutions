public class withoutString {
    public String withoutString(String base, String remove) {
        String result = "";
        String lowerBase = base.toLowerCase();
        String lowerRemove = remove.toLowerCase();

        int i = 0;

        while (i <= base.length() - remove.length()) {
            String sub = lowerBase.substring(i, i + remove.length());

            if (sub.equals(lowerRemove)) {
                i = i + remove.length();
            } else {
                result = result + base.charAt(i);
                i = i + 1;
            }
        }

        while (i < base.length()) {
            result = result + base.charAt(i);
            i = i + 1;
        }

        return result;
    }
}
