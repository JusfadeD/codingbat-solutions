package warmup2;

public class stringSplosion {
    public String stringSplosion(String str) {
        String re = "";
        for (int i=0; i<str.length(); i++) {
            re = re + str.substring(0, i+1);
        }
        return re;
    }
}
