package string1;

public class repeatFront {
    public String repeatFront(String str, int n) {
        String result = "";
        for (int i = n; i > 0; i--) {
            result = result + str.substring(0, i);
        }
        return result;
    }
}
