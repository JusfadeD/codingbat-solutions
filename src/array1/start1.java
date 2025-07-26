package array1;

public class start1 {
    public int start1(int[] a, int[] b) {
        int sum = 0;
        if (a.length > 0 && a[0] == 1) {
            sum += 1;
        }
        if (b.length > 0 && b[0] == 1) {
            sum += 1;
        }
        return sum;
    }
}
