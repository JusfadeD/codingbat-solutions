package logic1;

public class love6 {
    public boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        }

        if (a + b == 6) {
            return true;
        }

        if (Math.abs(a - b) == 6) {
            return true;
        }

        return false;
    }
}
