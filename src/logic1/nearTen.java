package logic1;

public class nearTen {
    public boolean nearTen(int num) {
        int mod = num % 10;

        if (mod <= 2 || mod >= 8) {
            return true;
        } else {
            return false;
        }
    }
}
