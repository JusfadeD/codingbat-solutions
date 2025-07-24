package warmup1;

public class max1020 {
    public int max1020(int a, int b) {
        if (b > a) {
            int n = a;
            a = b;
            b = n;
        }

        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }
}
