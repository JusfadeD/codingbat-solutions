package warmup1;

public class close10 {
    public int close10(int a, int b) {
        int Dif1 = Math.abs(a - 10);
        int Dif2 = Math.abs(b - 10);

        if (Dif1 < Dif2) {
            return a;
        }
        if (Dif2 < Dif1) {
            return b;
        }
        return 0;
    }
}
