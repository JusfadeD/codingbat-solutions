package string1;

public class oneTwo {
    public String oneTwo(String str) {
        String result = "";

        for (int i = 0; i <= str.length() - 3; i = i + 3) {
            String first = str.substring(i, i + 1);
            String second = str.substring(i + 1, i + 2);
            String third = str.substring(i + 2, i + 3);

            result = result + second + third + first;
        }

        return result;
    }
}
