package string1;

public class nTwice {
    public String nTwice(String str, int n) {
        String firstns = str.substring(0, n);
        String lastns = str.substring(str.length() - n);
        return firstns + lastns;
    }
}
