package string1;

public class endsLy {
    public boolean endsLy(String str) {
        if (str.length() < 2) {
            return false;
        }
        String lastTwo = str.substring(str.length() - 2);
        return lastTwo.equals("ly");
    }
}
