package logic1;

public class inOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            if (c > b) {
                return true;
            } else {
                return false;
            }
        } else {
            if (b > a && c > b) {
                return true;
            } else {
                return false;
            }
        }
    }
}
