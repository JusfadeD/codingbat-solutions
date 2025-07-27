public class equalIsNot {
    public boolean equalIsNot(String str) {
        int isCount = 0;
        int notCount = 0;

        for (int i = 0; i <= str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("is")) {
                isCount = isCount + 1;
            }
        }

        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("not")) {
                notCount = notCount + 1;
            }
        }

        if (isCount == notCount) {
            return true;
        } else {
            return false;
        }
    }
}
