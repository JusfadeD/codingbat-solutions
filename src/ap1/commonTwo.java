package ap1;

public class commonTwo {
    public int commonTwo(String[] a, String[] b) {
        int i = 0, j = 0, count = 0;
        String prev = "";

        while (i < a.length && j < b.length) {
            if (a[i].equals(b[j]) && !a[i].equals(prev)) {
                count++;
                prev = a[i];
                i++;
                j++;
            } else if (a[i].compareTo(b[j]) < 0) {
                i++;
            } else if (a[i].compareTo(b[j]) > 0) {
                j++;
            } else {
                prev = a[i];
                i++;
                j++;
            }
        }

        return count;
    }
}
