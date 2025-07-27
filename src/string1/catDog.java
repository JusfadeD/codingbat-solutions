package string1;

public class catDog {
    public boolean catDog(String str) {
        int dogc = 0;
        int catc = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't') {
                catc += 1;
            }

            if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g') {
                dogc += 1;
            }
        }

        if (dogc == catc) {
            return true;
        }

        return false;
    }
}
