package string1;

public class endOther {
    public boolean endOther(String a, String b) {
        String aLow = a.toLowerCase();
        String bLow = b.toLowerCase();

        if (aLow.endsWith(bLow) || bLow.endsWith(aLow)) {
            return true;
        } else {
            return false;
        }
    }
}
