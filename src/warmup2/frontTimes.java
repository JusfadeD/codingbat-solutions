package warmup2;

public class frontTimes {
    public String frontTimes(String str, int n) {
        int frontL = 3;
        if (frontL > str.length()) {
            frontL = str.length();
        }
        String front = str.substring(0, frontL);

        String result = "";
        for (int i=0; i<n; i++) {
            result = result + front;
        }
        return result;
    }
}
