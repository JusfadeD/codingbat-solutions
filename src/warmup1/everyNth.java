package warmup1;

public class everyNth {
    public String everyNth(String str, int n) {
        String ni = "";
        for (int i=0; i<str.length(); i = i + n) {
            ni = ni + str.charAt(i);
        }
        return ni;
    }
}
