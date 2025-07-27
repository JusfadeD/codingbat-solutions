public class sumDigits {
    public int sumDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                int digit = Integer.parseInt(String.valueOf(ch));
                sum = sum + digit;
            }
        }

        return sum;
    }
}
