package warmup2;

public class stringBits {
    public String stringBits(String str) {
        String re = "";
        for (int i=0; i<str.length(); i+=2) {
            re = re + str.substring(i, i+1);
        }
        return re;
    }
}
